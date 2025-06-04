// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        String s1 = "aab";
        String s2 = "aba";
        // concate the string with itself 
        // then find all possible substring 
        // if any substring matches it is the rotated one 
        String concateform=s1+s1;
        System.out.println(concateform.contains(s2));
     
         
       
    }
}
