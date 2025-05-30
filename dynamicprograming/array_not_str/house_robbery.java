// for each case 
// if u took nums[i] u cannot take i+1 +circular logic maintained 
//for each point u can choose house or not
// xample 1:

// Input: nums = [2,3,2]
// Output: 3
// Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
// Example 2:

// Input: nums = [1,2,3,1]
// Output: 4
// Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
// Total amount you can rob = 1 + 3 = 4.
// public int static robinbestway(int nums){
//     //left =0  to last
//     int max_amt1=recur(nums,0,len(nums)-2,colected_money)
//     int max_amt2=recur(nums,1,len(nums)-1,collected_money)
//     return max_amt1>max_amt2?max_amt1:max_amt2;

// }
// public int recur(int nums, int start, int end , int collected_money){
//     max_amt=0;
//     if(start=nums.length){
//         return max_amt;

//     }
//     else{
//        int amt= recur(nums,start+2,end,collected_money+nums[start])
//        int amt2= recur(nums,start+1,end,collected_money)
//     }
//     max_amt=Math.max(max_amt,Math.max(amt,amt2));


// }

public class HouseRobberII {

    public static int robinbestway(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        // Case 1: Rob from 0 to n-2
        int max_amt1 = recur(nums, 0, n - 2);

        // Case 2: Rob from 1 to n-1
        int max_amt2 = recur(nums, 1, n - 1);

        return Math.max(max_amt1, max_amt2);
    }

    // Recursive helper function
    public static int recur(int[] nums, int start, int end) {
        // Base case: if out of bounds
        if (start > end) {
            return 0;
        }

        // Option 1: Rob current house and move to start+2
        int rob = nums[start] + recur(nums, start + 2, end);

        // Option 2: Skip current house and move to start+1
        int skip = recur(nums, start + 1, end);

        // Take the maximum of robbing or skipping
        return Math.max(rob, skip);
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 2};
        int[] nums2 = {1, 2, 3, 1};

        System.out.println(robinbestway(nums1)); // Output: 3
        System.out.println(robinbestway(nums2)); // Output: 4
    }
}
