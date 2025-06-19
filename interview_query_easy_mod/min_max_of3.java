private static void min3max3() {
        List<Integer> randomNumbers = of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        List<Integer> min3 = randomNumbers.stream()
                .sorted(Integer::compare)
                .limit(3)
                .collect(toList());

        List<Integer> max3 = randomNumbers.stream()
                .sorted((x, y) -> Integer.compare(y, x))
                .limit(3)
                .collect(toList());
        System.out.println(min3);
        System.out.println(max3);
    }
