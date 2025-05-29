//longest common substring 
//no gap + sequence 


public class Main {

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "abfce";
        String res = longestCommonSubstring(s1, s2);
        System.out.println("Longest Common Substring: " + res);
    }

    public static String longestCommonSubstring(String s1, String s2) {
        return recur(s1, s2, 0, 0, "", "");
    }

    public static String recur(String s1, String s2, int p1, int p2, String curr, String max) {
        if (p1 >= s1.length() || p2 >= s2.length()) {
            return max.length() > curr.length() ? max : curr;
        }

        String newMax = max;

        if (s1.charAt(p1) == s2.charAt(p2)) {
            // Characters match, continue substring
            newMax = recur(s1, s2, p1 + 1, p2 + 1, curr + s1.charAt(p1), max);
        } else {
            // Characters don't match, reset current substring
            newMax = recur(s1, s2, p1 + 1, p2 + 1, "", max);
        }

        // Also explore skipping a character from either string
        String skipS1 = recur(s1, s2, p1 + 1, p2, "", newMax);
        String skipS2 = recur(s1, s2, p1, p2 + 1, "", newMax);

        // Return the longest among all
        String longest = newMax;
        if (skipS1.length() > longest.length()) longest = skipS1;
        if (skipS2.length() > longest.length()) longest = skipS2;

        return longest;
    }
}
