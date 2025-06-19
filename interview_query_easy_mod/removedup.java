 private static void removeDuplicateFromList() {
        List<Integer> oneToTen = of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> removeDuplicate = oneToTen.stream()
                .distinct()
                .collect(toList());

        System.out.println(removeDuplicate);
        Set<Integer> removeDuplicateWithoutOrder
                = oneToTen.stream()
                .collect(toSet());
        System.out.println(removeDuplicateWithoutOrder);

        List<Integer> uniqueElement = oneToTen
                .stream()
                .filter(number -> oneToTen.indexOf(number)
                        == oneToTen.lastIndexOf(number))
                .collect(toList());
        System.out.println(uniqueElement);
    }