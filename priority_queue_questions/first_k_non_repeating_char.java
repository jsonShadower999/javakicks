Find first `k` non-repeating characters in a string in a single traversal
Given a string, find first k non-repeating characters in it by doing only a single traversal of it.

For example, if the string is ABCDBAGHCHFAC and k = 3, output would be 'D', 'G', 'F'.

heap store {index,element,cnt_occurance_ele(default=0)}

comparator logic 
//if cnt of the alphabet become greater than 1 remove the set 
//else keep on storing it sort by index in ascending order  
class Element implements Comparable<Element>{
    int position_index;
    char character;
    int count_character_curr;
    public Element(int position_index,character,count_character_curr){
        this.position_index=position_index;
        this.character=character;
        //this.count_character_curr=1;

        this.count_character_curr=count_character_curr;
    }
    
    public int compareTo(Element ele){
        
        return Integer.compare(this.position_index,ele.position_index);
    }
}
public static ArrayList<String> findKnonrepeat(String S1, int k){
    HashMap<character,Integer> hmp= new HashMap();
    HashMap<character,Integer> firstindex_occured= new HashMap<>();
    for(int i=0;i<s1.length();i++){
        if(hmp.containsKey(s1.charAt(i))){
            hmp.put(hmp.getOrDefault(s1.charAt(i),0)+1);
            if(!firstindex_occured.containsKey(s1.charAt(i))){
                firstindex_occured.put(s1.charAt(i),i);
                //ele:index
            }
        }

    }
     PriorityQueue<Element> pq = new PriorityQueue<>();
    for(Map.Entry<K, V> entry: hmp.entrySet()){
        if(entry.getValue()==1){
            char ch=entry.getKey();
            int count_occurance=entry.getvalue();
            int position_index=firstindex_occured.get(ch);
            pq.offer(new Element(position_index,ch,1));
            //pq has the element 
        }

    }
    ArrayList<character> res=new ArrayList<>();
    while(!pq.isEmpty() && res.size()<k){
        res.add(pq.poll().character);

    }
    return res;


}
public static void main(String[] args) {
        String input = "ABCDBAGHCHFAC";
        int k = 3;
        ArrayList<Character> result = findKnonrepeat(input, k);
        System.out.println(result);  // Output: [D, G, F]
        }