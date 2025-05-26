// Sample Input 1 :
// aacfssa    
// 3
// Sample Output 1 :
// 5    
// Explanation of The Sample Input 1:
// Given 'str' = “aacfssa”. We can see that the substrings with only 3 distinct characters are {aacf, acf, cfs, cfss, fssa}. 

// Therefore, the answer will be 5.
// Sample Input 2 :
// qffds
// 4
// Sample Output 2 :
// 1
// Constraints:

import java.util.*;

public class Solution {
    
    public static int countSubStrings(String str, int k) {
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String sub = str.substring(i, j); // substring(i, j) is exclusive of j
                if (findKUnique(sub, k)) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static boolean findKUnique(String str, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return map.size() == k;
    }

    // Example main method for testing
    public static void main(String[] args) {
        String input = "abcbaa";
        int k = 3;
        int result = countSubStrings(input, k);
        System.out.println("Count of substrings with exactly " + k + " unique characters: " + result);
    }
}
