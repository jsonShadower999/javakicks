// Input: nums = [1,1,1,1,1], target = 3
// Output: 5
// Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
// -1 + 1 + 1 + 1 + 1 = 3
// +1 - 1 + 1 + 1 + 1 = 3
// +1 + 1 - 1 + 1 + 1 = 3
// +1 + 1 + 1 - 1 + 1 = 3
// +1 + 1 + 1 + 1 - 1 = 3

// function(nums, target,currentindex=0,currentsum=0){
//     if target==0 && nums.length==0{
//         return 0
//     }
//     if target==0 && nums.length!=0{
//         return -1
//     }
//     if(nums.length==0 && target){
//         return -1;
//     }
// res1=function(nums,target-nums[current],currentindex+1,currentsum+nums[currentindex])+
// res2=function(nums,target+nums[current],currentindex+1,currentsum-nums[currentindex])
// if(res1==target||res2==target){
//     cnt++
   
// }
// if(currentindex<nums.length){
//     return cnt;
// }
// }


public class TargetSum{
    int cnt_total_possibility=0;
    public int findtarget(int[] nums, int target){
        recur(nums,0,0,target);
        //nums,currentindex,currentsum,target
        return cnt_total_possibility;
    }
    public void recur(int[] nums, int currentindex, int currsum, int target){
        //think when to return when to end this reciurisive call 
        //end of the tree

        if(currentindex==nums.length ){
            if(currentsum==target){
                cnt_total_possibility;
            }

        }
        else{
            recur(nums,currentindex+1,currsum+nums[currentindex],target)
            recur(nums,currentindex+1,currsum-nums[currentindex],target)

        }
    }
    //main func
}