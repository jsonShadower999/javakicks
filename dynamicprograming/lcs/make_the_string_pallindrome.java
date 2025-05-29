public class Main {
    public static void main(String[] args) {
        String s1 = "abca";
        System.out.println(minMovesToPalindrome(s1));  // Output: 1
    }

    public static int minMovesToPalindrome(String s) {
        return recur(s, 0, s.length() - 1);
    }

    private static int recur(String s, int left, int right) {
        // Base case: one or no characters
        if (left >= right) {
            return 0;
        }

        // Characters match — move inward
        if (s.charAt(left) == s.charAt(right)) {
            return recur(s, left + 1, right - 1);
        }

        // Characters don't match — remove one from either end
        int removeLeft = 1 + recur(s, left + 1, right);
        int removeRight = 1 + recur(s, left, right - 1);

        return Math.min(removeLeft, removeRight);
    }
}
