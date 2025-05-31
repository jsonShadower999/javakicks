// Input: nums = [1,1,1,2,2,3], k = 2
// Output: [1,2]
//maintain hashmap {1:3,2:2,3:1}
//make minheap with comarator value of map
import java.util.*;

public class Main {
    public static List<Integer> getTopK(int[] nums, int k) {
        Map<Integer,Integer> freqmp=new HashMap<>();
        for(int n:nums){
            freqmp.put(n,freqmp.getOrDefault(n,0)+1);
        }
        //{key value but key with max value occured }
        PriorityQueue<Map.Entry<Integer,Integer>> minhp=new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for(Map.Entry<Integer,Integer> entry: freqmp.entrySet()){
            minheap.push(entry);
            if(minheap.size()>k){
                //then it is not k largest frame remove them
                minheap.poll();
            }
            // now make arraylist 
            List<Integer> res=new ArrayList<>();
            while(!minheap.isEmpty()){
                res.add(minheap.poll().getkey());
            }
            return res;
        }
    }
}