// Input: s = [10, 20, 30, 40, 50]
// Output: [50, 40, 20, 10]


// in case of nested loop can be optimised using stack concept 
//traverse till n/2  n fill with stack 
//middle delete on ===n/2 

public class solver{
      public static void deleteMiddle(Stack<Integer> st) {
        int size = st.size();
        int mid = size / 2;

        Stack<Integer> tempStack = new Stack<>();

        // Step 1: Move elements until the middle to tempStack
        for (int i = 0; i < size; i++) {
            int top = st.pop();
            if (i != mid) {
                tempStack.push(top); // skip middle
            }
        }

        // Step 2: Move elements back to original stack to maintain order
        while (!tempStack.isEmpty()) {
            st.push(tempStack.pop());
        }
    }

}
// arr2=50,40
// 30
// stack=10,20