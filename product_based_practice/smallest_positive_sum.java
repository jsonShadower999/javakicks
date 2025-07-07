// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=0;
        HashSet<Integer> hs=new HashSet<>();
        //ArrayList<Integer> sum_list=new ArrayList<>();
        
        
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    sum=sum+k;
                
                }
                hs.add(sum);
                sum=0;
                
                
            }
            
            
        }
        System.out.println(hs);
        
        
      
        
        
        
        
    }
}