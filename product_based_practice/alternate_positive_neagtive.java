// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//       int arr[] = {1, 2, 3, -4, -1, 4};
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, -4, -1, 4};
        
        ArrayList<Integer> positive_list=new ArrayList<>();
        ArrayList<Integer> negative_list=new ArrayList<>();
        ArrayList<Integer> new_ans=new ArrayList<>();
        for(int num:arr){
            if(num<0){
                negative_list.add(num);
                
            }
            else{
                positive_list.add(num);
            }
        }
        int i=0,j=0,k=1;
        while(i<=negative_list.size() && j<=positive_list.size()){
            if(k%2!=0){
                new_ans.add(positive_list.get(i));
                i++;
            }
            else{
                new_ans.add(negative_list.get(j));
                j++;
            }
            k++;
            
                
                
                
                
        }
        while(j<negative_list.size() && i==positive_list.size()){
                new_ans.add(negative_list.get(j));
                j++;
                k++;
            }
        while(i<positive_list.size() && j==negative_list.size()){
                new_ans.add(positive_list.get(i));
                i++;
                k++;
            }
        System.out.println(new_ans);
            
        }
        
    }


// you can use two pointer 


import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -4, -1, 4};

        // Separate positive and negative elements
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        boolean turnPos = true;

        // Alternate between positive and negative
        while (i < pos.size() && j < neg.size()) {
            if (turnPos) {
                result.add(pos.get(i++));
            } else {
                result.add(neg.get(j++));
            }
            turnPos = !turnPos;
        }

        // Add remaining elements if any
        while (i < pos.size()) result.add(pos.get(i++));
        while (j < neg.size()) result.add(neg.get(j++));

        System.out.println(result);
    }
}
