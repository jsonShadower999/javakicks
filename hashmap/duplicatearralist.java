import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        Collections.sort(arr);
        for(int i=1;i<n;i++){
            if(arr.get(i-1).equals(arr.get(i))){
                return arr.get(i-1);
            }
        }
        return -1;

        // Write your code here.
    }
}
