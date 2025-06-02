import java.util.*;
import java.util.stream.Collectors;
public class Main{
    public static void main(String[] args){
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,7);
        List<Integer> eve= numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println("eve nos"+ eve);
        List<Integer> odd=numbers.stream().filter(x->x%2!=0).collect(Collectors.toList());
        System.out.println("odd nos"+ odd);
      

    }

}