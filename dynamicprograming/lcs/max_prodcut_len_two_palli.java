// class Solution {
//     public int maxProduct(String s) {
//         recur(s,left,right,res)
//         recur(s,0,s.length()-1,[])
        
//     }
//     public int recur(String s, int start, int end){
//         max_product=1;
//         if(){

//         }
//         else{
//             if(s.charAt(start)==s.charAt(end)){
//                 int res1=2+recur(s,start++,end--)
//             }
//             else{
//                 int res2=recur(s,start++,end);
//                 int res3=recur(s,start,end--);
//             }
//         }
//         ArrayList<Integer> result_set=new ArrayList<Integer> ();
//         max1=result_set.addAll(res1,res2,res3).max();
//         result_set.remove(max1);
//         max2=result_set.max();
//         return max1*max2;

       


//     }
// }
// // }
// // max len pallindrom

// // all pallindrome possible 
// // if(stack.hassomething && pallindromlist.len>3)
// // if(stck.top>newval){
// //     ele=stck.pop()
// //     maxproduct=maxproduct=*ele
// // }
// // if pallindromlist<2:

// //   product=max(len(first)*len(second))
// //   stck=first,second
// //   up_till_nowmax=max (len(first),len(second))
// //   stck=up_till_nowmax

// //   max_product=max(max_prodcut,product)
// //   stck.fisrtpop
// //   stck.secondpop
//overlap problem...
import java.util.*;

class Solution {
    int maxProduct = 0;

    public int maxProduct(String s) {
        // Start recursion with empty two subsequences
        recur(s, 0, new StringBuilder(), new StringBuilder());
        return maxProduct;
    }

    // Recursive function to build two subsequences
    public void recur(String s, int index, StringBuilder s1, StringBuilder s2) {
        if (index == s.length()) {
            if (isPalindrome(s1) && isPalindrome(s2)) {
                maxProduct = Math.max(maxProduct, s1.length() * s2.length());
            }
            return;
        }

        char c = s.charAt(index);

        // Option 1: Add current char to s1
        s1.append(c);
        recur(s, index + 1, s1, s2);
        s1.deleteCharAt(s1.length() - 1);

        // Option 2: Add current char to s2
        s2.append(c);
        recur(s, index + 1, s1, s2);
        s2.deleteCharAt(s2.length() - 1);

        // Option 3: Skip current char
        recur(s, index + 1, s1, s2);
    }

    // Helper to check if a sequence is a palindrome
    private boolean isPalindrome(StringBuilder sb) {
        int left = 0, right = sb.length() - 1;
        while (left < right) {
            if (sb.charAt(left++) != sb.charAt(right--)) return false;
        }
        return true;
    }
}
import java.util.*;

class Solution {
    public int maxProduct(String s) {
        List<Pair> palindromes = new ArrayList<>();
        generatePalindromes(s, 0, new StringBuilder(), new HashSet<>(), palindromes);

        int maxProduct = 0;
        // Compare every pair of palindromic subsequences
        for (int i = 0; i < palindromes.size(); i++) {
            for (int j = i + 1; j < palindromes.size(); j++) {
                if (Collections.disjoint(palindromes.get(i).indices, palindromes.get(j).indices)) {
                    int product = palindromes.get(i).str.length() * palindromes.get(j).str.length();
                    maxProduct = Math.max(maxProduct, product);
                }
            }
        }

        return maxProduct;
    }

    // Recursive method to generate all palindromic subsequences
    private void generatePalindromes(String s, int index, StringBuilder sb, Set<Integer> used,
                                     List<Pair> palindromes) {
        if (index == s.length()) {
            if (isPalindrome(sb)) {
                palindromes.add(new Pair(sb.toString(), new HashSet<>(used)));
            }
            return;
        }

        // Option 1: include this character
        sb.append(s.charAt(index));
        used.add(index);
        generatePalindromes(s, index + 1, sb, used, palindromes);
        sb.deleteCharAt(sb.length() - 1);
        used.remove(index);

        // Option 2: skip this character
        generatePalindromes(s, index + 1, sb, used, palindromes);
    }

    private boolean isPalindrome(StringBuilder sb) {
        int l = 0, r = sb.length() - 1;
        while (l < r) {
            if (sb.charAt(l++) != sb.charAt(r--)) return false;
        }
        return true;
    }

    // Helper class to store the palindrome and the indices used
    class Pair {
        String str;
        Set<Integer> indices;

        Pair(String str, Set<Integer> indices) {
            this.str = str;
            this.indices = indices;
        }
    }
}




