 private static void separationOfEvenOddNumberInMap() {
        List<Integer> oneToTen = of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> evenAddOddSeparation = oneToTen.stream()
                .collect(partitioningBy(i -> i % 2 == 0));

        System.out.println(evenAddOddSeparation);
    }