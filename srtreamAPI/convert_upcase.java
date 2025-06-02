List<String> string_list=Arrays.asList("hello","lets","have","trial");
List<String> upcase=string_list.stream().map(String::toUpperCase).collect(Collectors.toList());
List<String> lowCase=string_list.stream().map(String::toLowerCase).collect(Collectors.toList());
