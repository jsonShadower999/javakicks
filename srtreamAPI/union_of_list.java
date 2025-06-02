List<Integer> union=Stream.concat(l1.stream(),l2.stream()).distinct().collect(Collectors.toList());
