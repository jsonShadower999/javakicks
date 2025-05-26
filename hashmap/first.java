// // // // // // // // An HashMap is a Java implementation of popular data structure hash table, which allows you to store key value pairs
// // // // // // // Both key and value object must implement equals() and hashcode() method if you intent to use them as key and value i HashMap. The hashcode() method of key is used to find the bucket location, where entry object is stored. Similarly, equals() method of key and value is used when you retrieve an object from HashMap.
// // // // // // The key difference between them is that HashMap is not thread-safe while Hashtable is thread-safe.
// // // // // // HashMap is not thread-safe but ConcurrentHashMap is thread-safe
// // // // // When hash function return same bucket location for two different objects then its called collision because there is already an object stored at that location. In case of collision different collision resolution strategy is used to resolve it e.g. double hashing
// // // //  TreeMap is a sorted Map, where key value pairs are stored in a sorted order imposed by Comparator (natural order) or Comparator (custom order).
// // //  TreeMap is a sorted Map, where key value pairs are stored in a sorted order imposed by Comparator (natural order) or Comparator (custom order).
// // // HashMap
// // // TreeMap  redblack tree 
// // // LinkedHashMap
// // // Hashtable

// // WeakHashMap are wrapped inside WeakReference object, which means if an object is not referred anywhere else other than the Map itself, then it is subject to garbage collection.
// No, you cannot store a duplicate value in the HashMap. If you try to store a key which already exists in the Map then its value is updated with the new value and put() method returns the old value. 

// // sort by key 
// // sort by vaues 
// #COUNT FREQUENCY OF ARRAY ELE 
//  arr[] = {10, 20, 20, 10, 10, 20, 5, 20}
// Output : 10 3
//          20 4
//          5  1


// mp.containsKey()
// mp.get()
// mp.put(,)
// mp.entrySet()
// mp.getKey()
// mp.getValue()

class HashMapperSolver{
    public static void countFreq(int arr[],int n){
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);

            }
            else{
                mp.put(arr[i],1)
            }
        }
        for(Map.Entry<Integer,Integer> ele : mp.entrySet()){
            System.out.println(ele.getKey()+" "+ele.getValue())
        }
    }
//     Input : arr[] = [1, 3, 2, 1, 4, 1]
// Output : 1
   public static void frequentele(int arr[],int n){
    HashMap<Integer,Integer> mp=new HashMap<>();
    for(int i=0;i<n;i++){
        if(mp.containsKey(arr[i])){
            mp.put(arr[i],mp.get(arr[i])+1);
        }
        else{
            mp.put(arr[i],1);
        }
    }
    for(var entry:mp.entrySet()){
        int ele_curr=entry.getKey();
        int ele_cnt=entry.getValue();
        int max_cnt=0;
        int ele_selected=-1;
        if(max_cnt<ele_cnt ){
            maxcnt=ele_cnt;
            ele_selected=ele_curr;
        }
    }
    System.out.println(ele_selected);
   }
//    Input: arr[] = [1, 2, 1, 3, 4, 2, 3], k = 4
// Output: [3, 4, 4, 3]
   public class Solver {
    public static void cntdistinctinwin(int arr[], int n, int k) {
        ArrayList<Integer> arr_win_lens = new ArrayList<>();
        
        for (int i = 0; i <= n - k; i++) {
            int[] subsetArray = Arrays.copyOfRange(arr, i, i + k);
            int len_now = compute(subsetArray);
            arr_win_lens.add(len_now);
        }

        System.out.println("Distinct counts in each window: " + arr_win_lens);
    }

    public static int compute(int arr[]) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        return mp.size();
    }
    public static boolean equalarr(int[] arr, int[] brr) {
        if (arr.length != brr.length) {
            return false;
        }

        Arrays.sort(arr);
        Arrays.sort(brr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != brr[i]) {
                return false;
            }
        }

        return true;
    }

// Input: arr[] = [1, 4, 1, 4, 5], k = 3
// Output: 4
// Explanation: There are 4 pairs with absolute difference 3, the pairs are [1, 4], [1, 4], [1, 4] and [4, 1]

}