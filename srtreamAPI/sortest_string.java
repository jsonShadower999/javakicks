List<String> string_list=Arrays.asList("hello","lets","have","trial");
Optional<String> res_str=string_list.stream().sorted().findFirst();
if(res_str.isPresent()){
    System.out.println("the smallest string",res_str);
}
else{
    System.out.println("nope ")
}

//
String shortest=string_list.stream().min(Comparator.comparingInt(String::length)).orElse(null);
