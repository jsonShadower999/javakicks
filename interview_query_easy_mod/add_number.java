// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the first number::");
        a=sc.nextInt();
        System.out.println("entre the second number");
        b=sc.nextInt();
        
        c=addTwonumbers(a,b);
        System.out.println("the addition is:::"+c);
        
      
    }
    public static int addTwonumbers(int a, int b){
        return a+b;
    }
}