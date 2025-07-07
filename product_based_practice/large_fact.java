// Input: n = 5
// Output: [1, 2, 0]
// Explanation: 5! = 1*2*3*4*5 = 120
import java.util.*;
class Main {
    public static void main(String[] args) {
        int num=5;
        int fact_no=find_factorial(num);
        String str_num=Integer.toString(fact_no);
        ArrayList<Integer> fact_arr=new ArrayList<>();
        for(char ch:str_num.toCharArray()){
            fact_arr.add(ch-'0');
        }
        System.out.println(fact_arr);
        
       
    }
    public static int find_factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        return fact;
        

    }
}
