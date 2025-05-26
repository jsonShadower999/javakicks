// You are given a binary array 'arr' of length 'N' and an integer 'k'. Return the number of subarrays having the count of 1's equal to ‘k’.



// Example :
// Let the array 'arr' be: [1, 0, 1].
// Let ‘k’ be: 1

// Then the subarrays having the number of ones equal to ‘k’ will be: [1], [1,0], [0,1], [1].
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1 :
// 4 2
// 1 1 0 1
// Sample output 1 :
// 3
// Explanation For Sample Output 1 :
// The subarrays having the number of ones equal to 2 will be: [1,1], [1,1,0], [1,0,1].

// So the count is 3.
// Sample Input 2 :
// 5 1
// 1 0 0 1 0
// Sample output 2 :
// 9


// import java.util.*;

// public class Solution {

//     public static int subarrayWithSum(int[] arr, int k) {
//         int finalCnt = 0;

//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i + 1; j <= arr.length; j++) { // must be <= to include full subarrays
//                 ArrayList<Integer> arrList = new ArrayList<>();

//                 for (int x = i; x < j; x++) {
//                     arrList.add(arr[x]);
//                 }

//                 if (checkNoOfOneK(arrList, k)) {
//                     finalCnt++;
//                 }
//             }
//         }

//         return finalCnt;
//     }

//     public static boolean checkNoOfOneK(ArrayList<Integer> arr, int k) {
//         int cnt = 0;
//         for (int i : arr) {
//             if (i == 1) {
//                 cnt++;
//             }
//         }
//         return cnt == k;
//     }

    
// }
import java.util.*;

public class Solution {
    public static int subarrayWithSum(int[] arr, int k) {
        int count = 0;
        int sum = 0;

        Map<Integer, Integer> prefixSumFreq = new HashMap<>();
        prefixSumFreq.put(0, 1); // To handle the case where sum == k directly

        for (int num : arr) {
            sum += num;

            if (prefixSumFreq.containsKey(sum - k)) {
                count += prefixSumFreq.get(sum - k);
            }

            prefixSumFreq.put(sum, prefixSumFreq.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

   
}

