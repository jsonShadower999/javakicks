// Input: gas[] = [4, 5, 7, 4], cost[] = [6, 6, 3, 5]
// Output: 2
// Explanation: Start at gas station at index 2 and fill up with 7 units of gas. Your tank = 0 + 7 = 7

// Travel to station 3. Available gas = (7 - 3 + 4) = 8.
// Travel to station 0. Available gas = (8 - 5 + 4) = 7.
// Travel to station 1. Available gas = (7 - 6 + 5) = 6.
// Return to station 2. Available gas = (6 - 6) = 0.
// Therefore, return 2 as the starting index.

import java.util.*;

public class Solution {
    public static Queue<Integer> reverseElements(Queue<Integer> q, int k) {
        Stack<Integer> stack = new Stack<>();

        
        for (int i = 0; i < k; i++) {
            stack.push(q.poll());
            //element from front are now gone!!!
        } //123

       
        while (!stack.isEmpty()) {
            q.offer(stack.pop());
            // insereted to front 
        }

      
        int size = q.size();
        for (int i = 0; i < size - k; i++) {
            q.offer(q.poll());
        }

        return q;
    }

}
