private static void minMaxFromList() {
        List<Integer> randomNumbers = of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        Integer maxNumber = randomNumbers.stream()
                .max(Integer::compareTo)
                .orElse(Integer.MAX_VALUE);
        Integer minValue = randomNumbers.stream()
                .min(Integer::compareTo)
                .orElse(Integer.MIN_VALUE);
        System.out.println(maxNumber);
        System.out.println(minValue);
}
