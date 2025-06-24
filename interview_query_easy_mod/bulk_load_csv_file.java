private static final String PIT_KEEP_ALIVE = "5m";
private static final int DEFAULT_FLUSH_INTERVAL = 100;

try (
    CSVPrinter csvPrinter = new CSVPrinter(response.getWriter(), CSVFormat.DEFAULT.withHeader(headers))
) {
    String pitId = openSearchClient.createPITId(worktypeCode, PIT_KEEP_ALIVE);
    String[] searchAfter = null;

    BoolQueryBuilder query = buildQueryForTaskSearch(taskStatuses, worklistIds, filter);
    NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
            .withQuery(query)
            .build();

    logger.info("Starting CSV export for worktype '{}' with batch size {}", worktypeCode, batchSize);

    String tenantName = TenantThreadUtil.getTenantDetails().get(TenantConstants.TENANT_NAME);
    String indexPrefix = tenantName + "_" + worktypeCode;

    int recordsSinceLastFlush = 0;

    while (true) {
        JSONObject searchResponse = openSearchClient.searchWithPIT(
                worktypeCode, pitId, batchSize, searchAfter, searchQuery
        );

        JSONObject hitsObject = searchResponse.getJSONObject("hits");
        JSONArray hits = hitsObject.getJSONArray("hits");

        if (hits.length() == 0) {
            logger.info("No more records to export. Ending pagination.");
            break;
        }

        logger.debug("Processing batch of {} records", hits.length());

        for (int i = 0; i < hits.length(); i++) {
            JSONObject hit = hits.getJSONObject(i);
            JSONObject source = hit.getJSONObject("_source");

            Task task = transformer.entityConverter(source, indexPrefix);

            if (task != null) {
                String[] values = extractCsvValues(task, fieldMappings);
                csvPrinter.printRecord((Object[]) values);
                processedResults++;
                recordsSinceLastFlush++;

                // Optional: flush per record for real-time streaming (can be commented out for perf)
                try {
                    csvPrinter.flush();
                } catch (IOException e) {
                    logger.warn("Flush failed during per-record write: {}", e.getMessage(), e);
                    throw e;
                }

                if (maxLimit > 0 && processedResults >= maxLimit) {
                    logger.info("Reached max limit of {} records. Ending export.", maxLimit);
                    return;
                }
            } else {
                logger.warn("Skipping null task from source: {}", source.toString());
            }

            // Flush periodically
            if (recordsSinceLastFlush % DEFAULT_FLUSH_INTERVAL == 0) {
                try {
                    csvPrinter.flush();
                } catch (IOException e) {
                    logger.warn("Flush failed during periodic flush: {}", e.getMessage(), e);
                    throw e;
                }
            }
        }

        // Update searchAfter for next batch
        JSONObject lastHit = hits.getJSONObject(hits.length() - 1);
        JSONArray sortValues = lastHit.getJSONArray("sort");
        searchAfter = new String[sortValues.length()];
        for (int j = 0; j < sortValues.length(); j++) {
            searchAfter[j] = sortValues.get(j).toString();
        }
    }

    logger.info("CSV export completed. Total records processed: {}", processedResults);
}
