List<Integer> numbers = Arrays.asList(4, 2, 8, 6, 10);
//sort in descending order 
//second ele 
Optional<Integer> sec_large=numbers.stream().sorted((a,b)->b-a).skip(1).findFirst();
