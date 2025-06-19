  private static void sortByLengthOfList() {
        List<String> names = Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");
        names.stream()
              .sorted(Comparator.comparingInt(String::length))
              .forEach(System.out::println);
    }