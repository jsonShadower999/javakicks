public class Main{
    pblic static void main(String[] args){
        Comparator<String> comparator = new Stringfunc();
        PriorityQueue<String> q= new PriorityQueue<String>(10,comparator);
        q.add("shirt");
        q.add("needs");
        q.add("iron safe service");
        while(q.size()!=0){
            System.out.println(q.remove());
        }

        
    }

}
class Stringfiunc implements Comparator<String{
    @Overide 
    public int compare(String s1, String s2){
        return Integer.compare(s1.length(),s2.length());
    }
}
class EcountComparator implements Comparator<String>{
    public int compare(String s1,String s2){
        return countchar(s1,'e')-countchar(s2,'e');

    }
    private int countchar(String s, char c){
        int cnt=0;
        for(char ch: s.toCharArray()){
            if(ch==c){
                cnt++;
            }
        }
        return cnt;
    }
}
//vowel cnt comparator 
class Vowelcountcomparator implements Comparator<String>{
    public int compare(String s1, String s2){
        return func(s1)-func(s2);
    }
    private int func(String s){
        int cnt=0;
        for(char c: s){
            if(c=="a" || c=="e"|| c=="i"|| c=="o"||c=="u"){
                cnt++;
                
            }
        }
        return cnt;
    }
}
//how many words they contain 
class WordCountComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
        return s1.split("\\s+").length - s2.split("\\s+").length;
    }
}