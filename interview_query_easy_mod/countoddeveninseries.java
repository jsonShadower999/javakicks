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
        
        seriescntoddeven(a,b);
     
        
      
    }
    public static void seriescntoddeven(int a, int b){
        int cnt_odd,cnt_even;
        cnt_odd=cnt_even=0;
        for(int i=a;i<=b;i++){
            if(i%2==0){
                cnt_even++;
            }
            else{
                cnt_odd++;
            }
            
            
        }
        System.out.println("no of even in series"+ cnt_even + "  "+
        "no of odd in series"+cnt_odd);
        
        
    }
}