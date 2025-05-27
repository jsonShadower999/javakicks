// // Minimum Removals for Target Sum

// // Given an array of positive integers arr[] and an integer k, you can remove either the leftmost or rightmost element from the array in one operation. After each operation, the size of arr[] is reduced by one.
// // Input: arr[] = [3, 4, 1, 3, 2], k = 5
// // Output: 2
// // Explanation: Removing 3 from left and 2 from right gives a sum of 5 in 2 operations.

// // public static int calculatesum(int arr[],left,right){
// //     int sum=0;
// //     for(int i=left;i<=right;i++){
// //         sum=sum+i;
// //     }
// //     return sum;
// // }
// // int left=0;
// // int right=arr.length-1;
// // public static int functargetsum_resolver(int arr[],k,left,right){
// //     int removalcnt=0;
// //     if(k>calculatesum(arr[],left,right)){
// //         return -1;
// //     }
// //     while(left<right){
// //         if(calculatesum(arr[],left,right)==k){
// //             return removalcnt;
// //         }
// //         else if(calculatesum(arr[],left,right)>k){
// //             if(k==calculatesum(arr[],left++,right)){
// //                 removalcnt++;
// //             }
// //             if(k==calculatesum(arr[],left,right--)){
// //                 removalcnt++;
// //             }

// //         }
// //     }
// //     if(removalcnt==0 && left>right){
// //         return -1;
// //     }

// // }
// public class MinRemovalsForTargetSum {

//     // Calculates sum between indices left and right (inclusive)
//     public static int calculateSum(int[] arr, int left, int right) {
//         int sum = 0;
//         for (int i = left; i <= right; i++) {
//             sum += arr[i];
//         }
//         return sum;
//     }

//     // Brute-force logic to minimize removals
//     public static int functargetsum_resolver(int[] arr, int k) {
//         int left = 0;
//         int right = arr.length - 1;
//         int totalSum = calculateSum(arr, left, right);

//         if (k > totalSum) return -1;
//         if (k == totalSum) return 0;

//         int removalCnt = 0;

//         while (left <= right) {
//             int currSum = calculateSum(arr, left, right);
//             if (currSum == k) {
//                 return removalCnt;
//             }

//             // Try removing from left
//             int sumIfRemoveLeft = calculateSum(arr, left + 1, right);
//             int sumIfRemoveRight = calculateSum(arr, left, right - 1);
// //attempt to greedily choose the side (left or right) whose removal brings the current sum closer to the target k.
//             if (Math.abs(sumIfRemoveLeft - k) <= Math.abs(sumIfRemoveRight - k)) {
//                 left++;
//             } else {
//                 right--;
//             }

//             removalCnt++;
//         }

//         return -1; // No solution found
//     }

//     public static void main(String[] args) {
//         int[] arr = {3, 4, 1, 3, 2};
//         int k = 5;
//         System.out.println("Minimum removals: " + functargetsum_resolver(arr, k)); // Output: 2
//     }
// }


// // but here left n right movemetn logic is anonymous n can fail 
// //    if (Math.abs(sumIfRemoveLeft - k) <= Math.abs(sumIfRemoveRight - k)) {
// //                 left++;
// //             } else {
// //                 right--;
// //             }
// // because u can not use sort form of array !!!
// // use slide window to optimise 

// // Input: arr[] = [1, 1, 3, 1, 2], k = 4
// // Output: 3

// // ans=[3,1] 
// // so we can say i need to find array where sum=totalsum-k with min removals 
// // means i need to create biggest array with sum=totalsum-k 
// //variable window size question 
// //If currSum < target, we simply continue expanding the window by moving right forward.

// //There's no action needed in that case — we just wait until either:

// currSum == target → update maxLen

// currSum > target → shrink the window from the left
// int calculatetotalsum(int arr[],int k){
//     int sum=0;
//     for(int i:arr){
//         sum=sum+i;
//     }
//     int target=sum-k;
//     solve(arr,target)
// }
// int[] solve(int arr[],int k){
//     int left=0;
//     int currsum=0;
//     int maxlen=-1;
//     for(int  right=0;right<n;right++){
//         currsum=currsum+arr[right];
//         while(currsum>target){
//             currsum=currSum-arr[left];
//             left++;

//         }
//         if(currsum===k){
//             maxlenres=max(maxlen,right-left+1);
//         }
//         if(currsum<target){

//         }

//     }
//     return maxlen;
    

// }


// ////////////////////////

public class MinRemovalsOptimized {

    // Function to calculate total sum
    public static int calculateTotalSum(int[] arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        return sum;
    }

    // Function to solve the sliding window part
    public static int findLongestSubarrayWithSum(int[] arr, int target) {
        int left = 0, currSum = 0, maxLen = -1;

        for (int right = 0; right < arr.length; right++) {
            currSum += arr[right];

            while (currSum > target && left <= right) {
                currSum -= arr[left];
                left++;
            }

            if (currSum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }

    public static int minRemovalsToReachK(int[] arr, int k) {
        int totalSum = calculateTotalSum(arr);
        int target = totalSum - k;

        if (target < 0) return -1; // Not possible to reach k

        if (target == 0) return 0; // Already matches

        int maxLen = findLongestSubarrayWithSum(arr, target);

        return maxLen == -1 ? -1 : arr.length - maxLen;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 1, 3, 2};
        int k1 = 5;
        System.out.println("Min removals (Input 1): " + minRemovalsToReachK(arr1, k1)); // Output: 2

        int[] arr2 = {1, 1, 3, 1, 2};
        int k2 = 4;
        System.out.println("Min removals (Input 2): " + minRemovalsToReachK(arr2, k2)); // Output: 3
    }
}
