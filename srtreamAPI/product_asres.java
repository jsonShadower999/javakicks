List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//int product=numbers.stream().reduce((a,b)->a*b);
int product=numbers.stream().reduce(1,(a,b)->a*b);

//filter(class::funcname)
//Collections.sort(list)
//Collections.reverse(list)