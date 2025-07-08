// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Input: str = "i.like.this.program.very.much" 
// Output: str = "much.very.program.this.like.i" 
class Main {
    public static void main(String[] args) {
        String str_l= "i.like.this.program.very.much" ;
        String[] all_list=str_l.split("\\.");
        int i;
        StringBuilder str_new=new StringBuilder();
        // for(String ele:all_list){
        //     System.out.println(ele);
        // }
        for(i=all_list.length-1;i>0;i--){
            str_new.append(all_list[i]);
            str_new.append(".");
            
        }
        if(i==0){
            str_new.append(all_list[0]);
        }
        System.out.println(str_new);
       
        
        
        
        
    }
}