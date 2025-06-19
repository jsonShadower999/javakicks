// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// compareTo()
// str.length()
// ==
// str1.equals(str2)
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String a, b, c;
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the first string::");
        a=sc.next();
        System.out.println("entre the second string");
        b=sc.next();
        
        greateoftwostr(a,b);
     
        
      
    }
    public static void greateoftwostr(String a, String b){
        int val_cmp=a.compareTo(b);
        if(val_cmp>0){
            System.out.println("a is greater"+a);
        }
        else{
            System.out.println("b is greater"+b);
        }
        
       
        
        
    }
    
    //
    
}