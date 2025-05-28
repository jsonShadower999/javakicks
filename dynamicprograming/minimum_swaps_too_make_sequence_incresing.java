// need to process !!!


// You are given two integer arrays of the same length nums1 and nums2. In one operation, you are allowed to swap nums1[i] with nums2[i].

// For example, if nums1 = [1,2,3,8], and nums2 = [5,6,7,4], you can swap the element at i = 3 to obtain nums1 = [1,2,3,4] and nums2 = [5,6,7,8].
// Return the minimum number of needed operations to make nums1 and nums2 strictly increasing. 


// Example 1:

// Input: nums1 = [1,3,5,4], nums2 = [1,2,3,7]
// Output: 1
// Explanation: 
// Swap nums1[3] and nums2[3]. Then the sequences are:
// nums1 = [1, 3, 5, 7] and nums2 = [1, 2, 3, 4]
// which are both strictly increasing.
// Example 2:

// Input: nums1 = [0,3,5,8,9], nums2 = [2,1,4,6,9]
// Output: 1
//check for increasing series 
// for all index check its increasing if not swap the  ith content n check again  if its true cnt++

class Solution {
    public int minSwap(int[] nums1, int[] nums2) {
        // Initialize the two states: 'swap' and 'notSwap'.
        // swap: min swaps needed when the last element is swapped.
        // notSwap: min swaps needed when the last element is not swapped.
        int notSwap = 0, swap = 1;
      
        // Iterate through each pair of elements starting from the second pair.
        for (int i = 1; i < nums1.length; ++i) {
            // 'prevNotSwap' and 'prevSwap' hold the previous state's values.
            int prevNotSwap = notSwap, prevSwap = swap;
          
            // Reset the values for the current state.
            notSwap = swap = nums1.length;
          
            // Check if the current and previous elements of both arrays are strictly increasing.
            if (nums1[i - 1] < nums1[i] && nums2[i - 1] < nums2[i]) {
                // If no swap is needed, carry forward the previous notSwap value.
                notSwap = prevNotSwap;
                // If we choose to swap the current elements, add 1 to the previous swap value.
                swap = prevSwap + 1;
            }
          
            // Check if swapping the previous elements makes the current pair strictly increasing.
            if (nums1[i - 1] < nums2[i] && nums2[i - 1] < nums1[i]) {
                // If so, notSwap can also be the minimum of itself and the previous swap value.
                notSwap = Math.min(notSwap, prevSwap);
                // Similarly, swap can also be the minimum of itself and prevNotSwap+1.
                swap = Math.min(swap, prevNotSwap + 1);
            }
        }
      
        // Return the minimum of the two final states.
        return Math.min(notSwap, swap);
    }
}