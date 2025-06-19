// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.*;
class Main {
    public static void main(String[] args) {
        int start,end;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the start");
        start=sc.nextInt();
        System.out.println("entre the end");
        end=sc.nextInt();
        ArrayList<Integer> arr_list=new ArrayList<>();
        for(int i=start;i<=end;i++){
            if(isprime(i)){
                arr_list.add(i);
            }
        }
        System.out.println(arr_list);
        int sum_arr=0;
        for(int i:arr_list){
            sum_arr=sum_arr+i;
            
        }
        System.out.println(sum_arr);
    }
    public static boolean isprime(int num){
        if(num==0|| num==1){
            return false;
        }
        if(num==2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num)+1;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
        
}
