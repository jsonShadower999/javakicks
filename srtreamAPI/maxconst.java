// revise again!!!
import java.util.Arrays;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "kiwi", "orange", "pear");
        Map<String, Long> frequencyMap = strings.stream()
                .collect(Collectors.toMap(s -> s, s -> s.chars().filter(c -> "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz".indexOf(c) != -1).count()));
        long maxConsonantCount = frequencyMap.values().stream().mapToLong(Long::longValue).max().orElse(0);
        List<String> maxConsonantStrings = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == maxConsonantCount)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("String(s) with maximum number of consonants: " + maxConsonantStrings);
    }
}