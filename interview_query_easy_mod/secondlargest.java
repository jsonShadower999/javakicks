 private static void secondLargestNumberFromList() {
        List<Integer> oneToTen = of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer secondLarge = oneToTen.stream()
                .sorted(reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(Integer.MAX_VALUE);

        System.out.println(secondLarge);
    }
