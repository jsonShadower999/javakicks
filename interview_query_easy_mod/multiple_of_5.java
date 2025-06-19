   private static void multipleOf5() {
        List<Integer> randomNumbers = of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        List<Integer> multipleOf5 = randomNumbers.stream()
                .filter(n -> n % 5 == 0)
                .collect(toList());
        System.out.println(multipleOf5);
    }