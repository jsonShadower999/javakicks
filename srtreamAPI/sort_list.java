List<String> string_list=Arrays.asList("hello","lets","have","trial");
List<String> sortedstr=string_list.stream().sorted().collect(Collectors.toList());
