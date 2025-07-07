// Given an array arr[], return the element that appears more than n / 2 times, where n is the array size. If no such element exists, return -1.
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,5,7,8,9,9,9,9,9,9,9,9};
        int n=arr.length;
        HashMap<Integer,Integer> hmp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hmp.put(arr[i],hmp.getOrDefault(arr[i],0)+1);
            
            
            
        }
        System.out.println(hmp);
        //int final_val;
        for(Map.Entry<Integer,Integer> entry: hmp.entrySet()){
            int key=entry.getKey();
            int value=entry.getValue();
            if(value>n/2){
                System.out.print(key);
            }
            
        }
        
        
        
        
        
    }
}