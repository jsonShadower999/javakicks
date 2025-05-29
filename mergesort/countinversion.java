import java.util.* ;
import java.io.*; 
// We have a total of 3 pairs which satisfy the condition of inversion. (3, 2), (2, 1) and (3, 1).
// Sample Input 2 :
// 5
// 2 5 1 3 4
public class Solution {
    public static long getInversions(long arr[], int n) {
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j] && i<j){
                    cnt++;
                }
            }
        }
        return cnt;
      
       

      
    }
}
