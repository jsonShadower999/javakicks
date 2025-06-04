
import java.util.*;
class Main {
    public static void main(String[] args) {
        String a="i.like.this.program.very.much";
       
        String finalstr="";
        String[] arr=a.split("[.]");// brackets r must
        for(String ele:arr){
            finalstr=finalstr+reversestr(ele,ele.length())+".";
            
        }
        System.out.println("finalstring"+":" +" "+ finalstr);
        
         
       
    }
    public static String reversestr(String a,int n ){
        
        String res="";
        if(n==0){
            return res;
            
        }
        
        return res+a.charAt(n-1)+reversestr(a,n-1);
            
            
        
    }
    // public static boolean recur(String a , int start , int end){
      
    // }
}
