List<Integer> numbers = Arrays.asList(4, 2, 8, 6, 10);
Optional<Integer> final_ans= numbers.stream().distinct().collect(Collectors.toList());
