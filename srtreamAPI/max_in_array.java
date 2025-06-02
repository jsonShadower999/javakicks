import java.util.*;
public class Main{
    public static void main(String[] args){
        List<Integer> numbers=Arrays.asList(2,3,4,5,6,68,8);
        int max= numbers.stream().mapToInt(Integer::intValue).max().orElseThrow();
        System.out.println("max ele"+max);
    }
}