 private static void reverseSortedList() {
        List<Integer> randomNumbers = of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        //this is throwing unsupportedOprerationException because we are
        // tries to sort ImmutableList that is not allowed .
        //   randomNumbers.sort(Comparator.reverseOrder());
        System.out.println(randomNumbers);
        List<Integer> sortInReverse = randomNumbers.stream()
                .sorted((x, y) -> Integer.compare(y, x)) // reverse sort
                .collect(toList());
        System.out.println(sortInReverse);

        List<Integer> sortListReverse = randomNumbers.stream()
                .sorted(reverseOrder())
                .collect(toList());
        System.out.println(sortListReverse);

    }