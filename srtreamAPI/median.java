// sort 
// find n/2 ele 
// if len is even then find  n/2+1 also 
// else return n/2 
// or avergare
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
n=numbers.size();

Optional<Integer> res= numbers.stream()mapToInt(Integer::intValue).sorted()skip(Math.floor(n/2-1))
// two or one element  that depend on len
.limit(n%2==0?2:1).avergare();


