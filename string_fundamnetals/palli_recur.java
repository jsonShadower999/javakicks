// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        String a="abba";
         System.out.println(recur(a,0,a.length()-1));
       
    }
    public static boolean recur(String a , int start , int end){
        while(start<end){
            if(a.charAt(start)==a.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}