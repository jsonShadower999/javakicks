// TWO SUM 
// USE TWO POINTER CONCEPT
import java.util.*
class Solution {
    public int[] twoSum(int[] nums, int target) {
      Arrays.sort(nums);
      int start=0;
      int end=nums.length-1;
      while(start<end){
        if(nums[start]+nums[end]<target){
          start=start+1;
        }
        else if(nums[start]+nums[end]>target){
          end=end-1;
        }
        else{
          return new int[]{left, right};
          
          
      
        
    }
}


  
