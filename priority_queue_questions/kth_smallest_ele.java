import java.util.PriorityQueue;
import java.util.Collections;

public class KthSmallest {

    public static int findKthSmallest(int[] arr, int k) {
        // Max heap: reverse natural order
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Step 1: Add first k elements
        for (int i = 0; i < k; i++) {
            maxHeap.add(arr[i]);
        }

        // Step 2: Process the rest of the array
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < maxHeap.peek()) {
                maxHeap.poll();            // remove the largest
                maxHeap.add(arr[i]);       // add current element
            }
        }

        // Step 3: Top of heap is the K-th smallest
        return maxHeap.peek();
    }

    public static void main(String[] args) {
      
    }
}
