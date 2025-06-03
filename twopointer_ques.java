// import java.util.*;
// public class Solution {
//     public static List<List<Integer>> fourSum(int []nums, int target) {
//         // a+b+c+d=target
//         // a+b+c=target-d;
//         int cnt=0;
//         Collections.sort(nums);
//         int start=0;
//         int end=nums.length-1;
        
//         while(start<end){
//             for(int variate=1;variate<nums.length-1;variate++){a
//                 if(arr[variate]!=arr[start] || arr[variate]!=arr[end]){
//                     for(int variate1=2;variate1<nums.length-2;variate1++){
//                         if(arr[start]+arr[end]+arr[variate]==target-arr[variate1]){
//                             cnt++;
                            
//                         }

//                     }
                    
//                 }
                
//             }
//             return cnt;
//         }


//         // Write your code here.
//     }
// }


import java.util.*;

public class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        if (n < 4) return result;

        Arrays.sort(nums);  

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; 

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1;
                int right = n - 1;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                       
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}
