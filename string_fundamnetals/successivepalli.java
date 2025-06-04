class Main {
    public static void main(String[] args) {
        String s = "aeccdda";
        boolean result = validPalindrome(s);
        System.out.println(result);  // Output: true or false
    }

    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                //aacddaa
                //aa  ---aa
                //c---d mismatch 
                //so choose aacdaa or aaddaa 
                // now for these two cases check for palli again  
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;//palli
    }

    public static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
