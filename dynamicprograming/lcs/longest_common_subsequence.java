public class Main {
//in subsequence ::: there can be gap , but order is maintained full/ORDER NEEDS TO BE FULL CORRECT!!!
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        String res = func_lcs(s1, s2);
        System.out.println("Longest Common Subsequence: " + res);
    }

    public static String func_lcs(String s1, String s2) {
        return recur(s1, s2, "", 0, 0);
    }

    public static String recur(String s1, String s2, String res, int curr_p1, int curr_p2) {
        if (curr_p1 >= s1.length() || curr_p2 >= s2.length()) {
            return res;
        }

        String res1 = "";
        if (s1.charAt(curr_p1) == s2.charAt(curr_p2)) {
            res1 = recur(s1, s2, res + s1.charAt(curr_p1), curr_p1 + 1, curr_p2 + 1);
        }

        String res2 = recur(s1, s2, res, curr_p1, curr_p2 + 1);
        String res3 = recur(s1, s2, res, curr_p1 + 1, curr_p2);

        // Return the longest result
        if (res1.length() >= res2.length() && res1.length() >= res3.length()) {
            return res1;
        } else if (res2.length() >= res3.length()) {
            return res2;
        } else {
            return res3;
        }
    }
}
