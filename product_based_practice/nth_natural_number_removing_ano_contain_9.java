// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// nth natural no exclude the no contain 9
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        int nth=8;
        int cnt_current=0;
        int current_no=1;
        while(cnt_current<nth){
            if(!isnineinno(current_no)){
               // System.out.println(current_no);
                cnt_current++;
                
            }
            
            current_no++;
        }
        
        
        System.out.println(current_no-1);
        
        
    }
    public static boolean isnineinno(int num){
        String num_str=Integer.toString(num);
        if (num_str.contains("9")){
            return true;
        }
        else{
            return false;
        }
       
    }
}