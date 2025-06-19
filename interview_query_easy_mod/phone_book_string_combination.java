import java.util.*;

class Main {
    public static void main(String[] args) {
        String digits;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the digits (2-9 only): ");
        digits = sc.next();

        if (digits.length() < 2) {
            System.out.println("Please enter at least two digits.");
            return;
        }

        // Creating the phone digit to letter map
        HashMap<Character, String> phoneMap = new HashMap<>();
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");

        char digit1 = digits.charAt(0);
        char digit2 = digits.charAt(1);

        String str1 = phoneMap.get(digit1);
        String str2 = phoneMap.get(digit2);

        if (str1 != null && str2 != null) {
            ArrayList<String> res = funcresolver(str1, str2);
            System.out.println("Combinations: " + res);
        } else {
            System.out.println("Invalid digits entered.");
        }
    }

    public static ArrayList<String> funcresolver(String s1, String s2) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                String newstr = ""+s1.charAt(i) + s2.charAt(j); // Concatenate characters
                res.add(newstr);
            }
        }
        return res;
    }
}
