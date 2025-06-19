// a>b?a:b>c?b:c 


// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// compareTo()
// str.length()
// ==
// str1.equals(str2)
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the first no::");
        a=sc.nextInt();
        System.out.println("entre the second no");
        b=sc.nextInt();
        System.out.println("enter the third no");
        c=sc.nextInt();
        int res=greatestofthree(a,b,c);
        System.out.println("the greatest of three numbers!!!"+res);
        
        
     
        
      
    }
    public static int greatestofthree(int a, int b, int c){
        return a>b?a:b>c?b:c;

       
        
        
    }
    
    //
    
}