// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
// Output: 6
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr[]={8, 2, 4, 5, 3, 7, 1};
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=1){
                System.out.println(arr[i]-1);
            }
        }
       
        
        
    }
}