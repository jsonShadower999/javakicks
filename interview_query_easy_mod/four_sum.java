// 12,23,4,5,23,4,5,5,5,3,4
// sum=10
// i=0 to n , j=i+1 to n
// left , right 


//i agar 0
// j is 1 greater than i 
// left j se 1 reater 
// right start with last
// tabhi ;loop only n-3
import java.util.Arrays;
public class foursummer{
    public void foursum(int[] nums, int target){
        List<Integer> res=new ArrayList<>();
        if(nums==null|| nums.length<4){
            return res;//empty
        }
        Arrays.sort(nums);
        int len_nums=nums.length;
        for(int i=0;i<len_nums-3;i++){
            for(int j=i+1;j<len_nums-2;j++){
                int left=j+1;
                int right=len_nums-1;
                while(left<right){
                    long sum= (long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        res.add(nums[i]);
                        res.add(nums[j]);
                        res.add(nums[left]);
                        res.add(nums[right]);
                        left++;
                        right--;

                    }
                    else if(sum<target){
                        left++;
                    }{
                        right--;
                    }
                }
                return res;
            }
        }


    }
}