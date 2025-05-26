// Input: elements present in stack from top to bottom 4 3 2 1
// Output: 1 2 3 4
public static void reverse(Stack<Integer> st){
    Stack<Integer> st_rev=new Stack<>();
    while(!st.isEmpty()){
        st_rev.push(st.pop())
    }
    //st that is empty
    while(!st_rev.isEmpty()){
        st.push(st_rev.pop())
    }

}
