// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr1[]={2,3,1,3,2,4,6,7,9,2,19};
        int arr2[]={2,1,4,3,9,6};
        ArrayList<Integer> arr_list=new ArrayList<>();
        HashMap<Integer,Integer> hmp=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            hmp.put(arr1[i],hmp.getOrDefault(arr1[i],0)+1);
            
        }
        System.out.println(hmp);
        int current_pointer=0;
        for(Map.Entry<Integer,Integer> entry:hmp.entrySet()){
            if(current_pointer && arr2[current_pointer]){
                if(hmp.getValue(arr2[current_pointer])){
                    int repeat_times=hmp.getValue(arr2[current_pointer]);
                    int repaet_ele=arr2[current_pointer];
                    while(repeat_times){
                        
                        arr_list.add(repeat_ele);
                        
                    }
                    
                    
                }
                
            }
            current_pointer++;
            
        }
       
        
        
        
        
        
    
       
    }
}