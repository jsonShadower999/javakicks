List<String> sentences = Arrays.asList(
    "Java Stream API provides a fluent interface",
    "It supports functional-style operations on streams",
    "In this exercise, you need to count words"
);

long uniqueWords = sentences.stream()
    .map(x -> x.toLowerCase().split(" "))
    .flatMap(Arrays::stream)
    .distinct()
    .count();