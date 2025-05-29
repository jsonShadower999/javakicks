import java.util.*;

public class Solver {

    // Function to insert an element into the sorted stack
    public static void sort_the_stacker(int new_ele, Stack<Integer> st) {
        if (st.isEmpty() || new_ele > st.peek()) {
            st.push(new_ele);
            return;
        }

        // If top is greater, pop and recur
        int top = st.pop();
        sort_the_stacker(new_ele, st);

        // Push the popped item back after recursion
        st.push(top);
    }

    // Recursive function to sort the stack
    public static void sort(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int temp = st.pop();
            sort(st);                      // Sort the remaining stack
            sort_the_stacker(temp, st);   // Insert element at correct position
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3); // Top is 3

        System.out.println("Original Stack: " + st);
        sort(st);
        System.out.println("Sorted Stack (Descending): " + st);
    }
}
