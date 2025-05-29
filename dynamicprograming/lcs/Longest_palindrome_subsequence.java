// Example 1:

// Input: s = "bbbab"
// Output: 4
// Explanation: One possible longest palindromic subsequence is "bbbb".

// public class Main{
//     public static void Main(){

//     }
//     public static int findLongestPalidromesubsequence(String s){
//        // recur(s,left,right,res,lenres)
//        recur(s,0,s.length()-1,"",0);

//     }
//     public static int recur(Sting s, int left,int right ,String res,int lenres){
//         int max_len=0;
//         if(right==s.length()){
//             return max_len;

//         }
//         else{
//             if(s.charAt(left)==s.charAt(right)){
//                 int res3=recur(s,left++,right--,res+s.charAt(left)+s.charAt(right),lenres+2);
                
//             }
//             else{
//                 int res1=recur(s,left++,right,res,lenres)
//                 int res2=recur(s,left,right--,res,lenres)
//             }
           
//         }
//         max_len=Math.max(res3,Math.max(res2,res1))

//     }
    
// }

public class Main {
    public static void main(String[] args) {
        String s = "bbbab";
        System.out.println(findLongestPalindromeSubsequence(s));  // Output: 4
    }

    public static int findLongestPalindromeSubsequence(String s) {
        return recur(s, 0, s.length() - 1);
    }

    public static int recur(String s, int left, int right) {
        if (left > right) return 0;
        if (left == right) return 1;

        if (s.charAt(left) == s.charAt(right)) {
            return 2 + recur(s, left + 1, right - 1);
        } else {
            int res1 = recur(s, left + 1, right);
            int res2 = recur(s, left, right - 1);
            return Math.max(res1, res2);
        }
    }
}
