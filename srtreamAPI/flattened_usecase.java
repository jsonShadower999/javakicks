List<List<String>> names = Arrays.asList(
    Arrays.asList("John", "Jane"),
    Arrays.asList("Tom", "Jerry")
);

List<String> flat = names.stream()
    .flatMap(Collection::stream)
    .collect(Collectors.toList());
System.out.println(flat);