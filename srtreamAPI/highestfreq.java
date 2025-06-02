// List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 4, 4, 5, 5);
// //its allready sorted
// //i can not use count for integer 
// //use hashmap
// //numbers.stream().max((a,b)->b.count()>a.count())
// Map<Integer,Long> mp=numbers.stream.collect(Collectors.groupingBy(n->n,Collectors.counting()));
// //{a:2}
// //iterate entryset
// Optional<Map.Entry<Integer, Long>> res= mp.entrySet().stream().max((a,b)->b.getValue()>a.getValue());
// //{a:7}
// res.entrySet().stream().map(entryset::value)


import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 4, 4, 5, 5);

        // Step 1: Frequency map
        Map<Integer, Long> mp = numbers.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        // Step 2: Get the entry with max value (frequency)
        Optional<Map.Entry<Integer, Long>> res = mp.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));

        // Step 3: Access the value from the entry
        res.ifPresent(entry -> {
            System.out.println("Most frequent element: " + entry.getKey());
            System.out.println("Frequency: " + entry.getValue());
        });
    }
}


//revise again!!!