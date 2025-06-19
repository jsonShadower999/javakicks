// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        String str="Hello welcome to java compiling plt";
        String[] str_arr=str.split(" ");
        for(String word: str_arr){
            StringBuilder s_rev=new StringBuilder(word);
            
            sb.append(s_rev.reverse().toString()+" ");
            
        }
        System.out.println(sb);
    }
}