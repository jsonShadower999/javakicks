List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 4, 4, 5, 5);
Map<Integer,Long> freqmp=numbers.stream().collect(Collectors.groupingBy(i->i, Collectors.couting()));
long maxfreq=freqmp.values().stream().mapToLong(Long::longvalue).max();
List<Integer> answer= freqmp.entrySet().stream().filter(a->a.getValue()==maxfreq)
.map(Map.Entry::getkey).collect(Collectors.toList());
Systemout.println("mode for the series is"+ answer);

//long is the count retiurn type