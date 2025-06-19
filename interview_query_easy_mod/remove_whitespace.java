// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        String string_char="   Swap in tw  o lie tow  ";
        StringBuilder str=new StringBuilder();
        char[] ch_arr=string_char.toCharArray();
        for(char ch:ch_arr){
            if(!Character.isWhitespace(ch)){
                str.append(ch);
            }
        }
        System.out.println(str);
       
       
    }
}