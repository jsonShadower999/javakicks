//deleteCharAt() +indexOf()

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        String str_w="hello java compiler ";
        String w="a";
        StringBuilder sb=new StringBuilder(str_w);
        int index=sb.indexOf(w);
        if(index!=-1){
            sb.deleteCharAt(index);
        }
        System.out.println(sb);
        
        
        
    }
}