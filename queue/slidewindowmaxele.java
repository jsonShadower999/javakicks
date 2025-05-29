// Input: arr[] = [1, 2, 3, 1, 4, 5, 2, 3, 6], k = 3
// Output: [3, 3, 4, 5, 5, 5, 6] 
// for(i=0 to n){
//    for(j=i;j<=i+k;j++){
//     queue.offer(arr[j])

//    }
//    res.add(findmaxinqueue(queue))
//    queue=[]
// }
// return res


// res = []
// for i from 0 to n - k:
//     maxVal = arr[i]
//     for j from i to i + k - 1:
//         if arr[j] > maxVal:
//             maxVal = arr[j]
//     res.add(maxVal)
// return res

public  static void windowmax(int arr[], k){
    ArrayList<Integer> arrlist=new ArrayList<>();
    for(int i=0;i<arr.length-k;i++){
        maxval=arr[i];
        for(int j=i;j<i+k-1;j++){
            //created window to process it
            if arr[j]>maxval{
                maxval=arr[j];
            }
        }
        arrlist.add(maxval);

    }
    return arrlist;
}

//import java.util.*;

// public class SlidingWindowMaxOptimal {
//     public static List<Integer> maxSlidingWindow(int[] arr, int k) {
//         List<Integer> res = new ArrayList<>();
//         Deque<Integer> deque = new ArrayDeque<>();  // stores indices

//         for (int i = 0; i < arr.length; i++) {
//             // Remove elements out of current window
//             if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
//                 deque.pollFirst();
//             }

//             // Remove all elements smaller than current from the back
//             while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
//                 deque.pollLast();
//             }

//             deque.offerLast(i);

//             // Add max of current window to result
//             if (i >= k - 1) {
//                 res.add(arr[deque.peekFirst()]);
//             }
//         }

//         return res;
//     }

//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
//         int k = 3;
//         System.out.println(maxSlidingWindow(arr, k));  // Output: [3, 3, 4, 5, 5, 5, 6]
//     }
// }
