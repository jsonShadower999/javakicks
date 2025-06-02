Random random = new Random();
Stream<Integer> stream = 
                 Stream.generate(
                   () -> {return random.nextInt(100);} // generating random numbers between 0 and 99
                 ).limit(5);


    // Using a stream to filter and double each element
List<Integer> doubledNumbers = numbers.stream()
                .filter(num -> num % 2 == 0) // Filter even numbers
                .map(num -> num * 2) // Double each number
                .collect(Collectors.toList()); //                 