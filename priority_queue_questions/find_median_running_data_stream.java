

import java.util.*;
// make a balancer 
//load balancing in two bins !!!1
public class Median {
    public static ArrayList<Double> findMedian(int[] arr) {
        ArrayList<Double> res = new ArrayList<>();

        // Max-heap for the lower half
        PriorityQueue<Integer> lower = new PriorityQueue<>(Collections.reverseOrder());

        // Min-heap for the upper half
        PriorityQueue<Integer> up = new PriorityQueue<>();

        for (int num : arr) {
            // Step 1: Add number to one of the heaps
            if (lower.isEmpty() || num <= lower.peek()) {
                lower.offer(num);
            } else {
                up.offer(num);
            }

            // Step 2: Balance the heaps
            if (lower.size() > upper.size() + 1) {
                upper.offer(lower.poll());
            } else if (upper.size() > lower.size()) {
                lower.offer(upper.poll());
            }

            // Step 3: Calculate median
            if (lower.size() == upper.size()) {
                double median = (lower.peek() + upper.peek()) / 2.0;
                res.add(median);
            } else {
                res.add((double) lower.peek());
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 15, 1, 3, 2, 8};
        ArrayList<Double> medians = Median(arr);
        System.out.println(medians); // Output: [5.0, 10.0, 5.0, 4.0, 3.0, 4.0]
    }
}
