// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        String a="abbac";
         //System.out.println(recur(a,0,a.length()-1));
         System.out.println(reversestr(a,a.length()));
         
       
    }
  
    public static String reversestr(String a,int n ){
        
        String res="";
        if(n==0){
            return res;
            
        }
        
        return res+a.charAt(n-1)+reversestr(a,n-1);
            
            
        
    }
}