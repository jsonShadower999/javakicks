import java.util.*;

public class SubstringCounter {
    public static int funcbrute(String s, int k) {
        int cnt = 0;
        List<String> substrlist = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substr = s.substring(i, j);
                substrlist.add(substr);
            }
        }

        for (String substr : substrlist) {
            int uniquele = getlenofuniqueterm(substr);
            if (uniquele == k) {
                cnt++;
            }
        }

        return cnt;
    }

    public static int getlenofuniqueterm(String s) {
        HashSet<Character> hset = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            hset.add(s.charAt(i));
        }
        return hset.size();
    }

    public static void main(String[] args) {
        String s = "abcba";
        int k = 2;
        System.out.println("Count: " + funcbrute(s, k));  // Expected output: 5
    }
}


/// it is variable window question 

// public static String[] cntsubstring_k_distinct_char(String s,int k){
//     //window size k
//     int left=0;
//     int right=0;
  
//         for(int i=left;i<=right;i++){
//             if(k==getlenofuniqueterm(s.substring(left,right))){
//                 cnt++;

//             }
//             //for the first window do the comput e!!!

//         }

//     while(right<s.length()){

//     }
   

// }
// import java.util.*;

// public class SubstringCounter {

//     public static int countExactlyKDistinct(String s, int k) {
//         return countAtMostKDistinct(s, k) - countAtMostKDistinct(s, k - 1);
//     }

//     private static int countAtMostKDistinct(String s, int k) {
//         if (k == 0) return 0;

//         Map<Character, Integer> freqMap = new HashMap<>();
//         int left = 0, right = 0;
//         int count = 0;

//         for (right = 0; right < s.length(); right++) {
//             char ch = s.charAt(right);
//             freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);

//             while (freqMap.size() > k) {
//                 char leftChar = s.charAt(left);
//                 freqMap.put(leftChar, freqMap.get(leftChar) - 1);
//                 if (freqMap.get(leftChar) == 0) {
//                     freqMap.remove(leftChar);
//                 }
//                 left++;
//             }

//             count += right - left + 1;
//         }

//         return count;
//     }

//     public static void main(String[] args) {
//         String s = "abcba";
//         int k = 2;
//         System.out.println("Count of substrings with exactly " + k + " distinct characters: " + countExactlyKDistinct(s, k));
//     }
// }

