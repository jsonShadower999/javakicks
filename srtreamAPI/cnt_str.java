public class Main{
    public static void main(String[] args){
        List<String> arrlist=Arrays.asList("apple", "banana", "orange", "grape");
        long cnt=arrlist.stream().filter(x->x.contains("a")).count();
        System.out.println("the no of ele with a "+cnt);

//The count() method returns a long, so it's better to assign it to a long variable.


    }
}