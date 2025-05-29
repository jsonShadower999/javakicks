// Input: txt = "geeks", pat = "eke"
// Output: true
// Explanation: "eek" is a permutation of "eke" which exists in "geeks".

// Input: txt = "programming", pat = "rain"
// Output: false
// Explanation: No permutation of "rain" exists as a substring in "programming".

public static boolean checkpermuteinsubstring(String txt, String pat){
    k=pat.length();
    left=0;
   
    for(int i=left;i<k;i++){
        newstr.add(txt.charat(i));
        pat.sort();
        if(newstr.equals(pat)){
            return true;
        }
        while(k<txt.length()){
        //
        left++;
    }

      


    }
   
}
import java.util.Arrays;

public class Main {
    public static boolean checkPermuteInSubstring(String txt, String pat) {
        int k = pat.length();
        if (k > txt.length()) return false;

        // Sort the pattern
        char[] sortedPat = pat.toCharArray();
        Arrays.sort(sortedPat);
        String sortedPattern = new String(sortedPat);

        for (int i = 0; i <= txt.length() - k; i++) {
            String window = txt.substring(i, i + k);
            char[] windowChars = window.toCharArray();
            Arrays.sort(windowChars);
            String sortedWindow = new String(windowChars);

            if (sortedWindow.equals(sortedPattern)) {
                return true;
            }
        }

        return false;
    }

    
}

    
import java.util.Arrays;

public class Main {
    public static boolean checkPermuteInSubstring(String txt, String pat) {
        int k = pat.length();
        if (k > txt.length()) return false;

        int[] patFreq = new int[26];
        int[] windowFreq = new int[26];

        // Build frequency map for pattern
        for (int i = 0; i < k; i++) {
            patFreq[pat.charAt(i) - 'a']++;
            windowFreq[txt.charAt(i) - 'a']++;
        }

        // Slide the window over txt
        for (int i = k; i < txt.length(); i++) {
            if (Arrays.equals(patFreq, windowFreq)) {
                return true;
            }

            // Slide the window: remove left char, add right char
            windowFreq[txt.charAt(i) - 'a']++;
            windowFreq[txt.charAt(i - k) - 'a']--;
        }

        // Check the last window
        return Arrays.equals(patFreq, windowFreq);
    }

   
}
