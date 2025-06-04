// Input: S = { "the", "quick", "brown", "fox", "quick"}, word1 = "the", word2 = "fox"
// Output: 3

import java.util.*;

class Main {
    public static void main(String[] args) {
        String[] str_list = { "the", "quick", "brown", "fox", "quick" };
        int min_distance = Integer.MAX_VALUE;

        String w1 = "the";
        String w2 = "fox";
        int position_1 = -1;
        int position_2 = -1;

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals(w1)) {
                position_1 = i;
            }
            if (str_list[i].equals(w2)) {
                position_2 = i;
            }

            if (position_1 != -1 && position_2 != -1) {
                int current_distance = Math.abs(position_2 - position_1);
                min_distance = Math.min(current_distance, min_distance);
            }
        }

        System.out.println("Minimum distance: " + min_distance);
    }
}
