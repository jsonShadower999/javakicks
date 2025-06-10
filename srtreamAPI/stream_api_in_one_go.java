public class StreamApi{
    public static void main(String[] args){
        Stream<Integr> s1= Stream.of(1,2,3,4,5); // predefned stream 
        s1.forEach(a->System.out.print(a));
        List<String>list=new ArrayList<>();
        list.add("abc");
        list.add("rem");
        list.add("semi"); 
        // i converted list to a  stream , n then operate !!!
        list.stream().forEach(a->System.out.println(a));

    }
}
