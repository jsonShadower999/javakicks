import java.util.*;
// class Main {
// //     Input: dict = [ "ale", "apple", "monkey", "plea" ],  str ="abpcplea" 
// // Output: apple
// // Explanation: On removing characters at indexes 1,3,7 we can form string "apple" , similarly we can form strings "ale" and "plea" also, but "apple" is the longest string so we return "apple".

//     public static void main(String[] args) {
//           public static boolean isSubSequence(String d, String s) {
//               String[] dict={"ale", "apple", "monkey", "plea"};
//               int max_len_possible=Integer.MIN_VALUE;
//               int index=-1;
//               String totest="abpcplea";
//               for(String str: dict){
//                   len1=str.length();
//                   right=Math.min(totest.length(),len1);
//                  // recur(str,totest,left,right)
//                   String singleins=recur(str,totest,0,0,right);
//                   if(singleins!=""){
//                       index=str.index();
                      
//                   }
//                   int singleanslen=singleins.length();
                  
//                   max_len_possible=Math.max(singleanslen,max_len_possible);
                  
//               }
              
              
//         // Output: true or false
//     }
//     // apple    abpcplea 
//     // a---a 
//     public static String  recur(String str, String totest , int pos1,int pos2,int right){
//         if(pos1==right-1 || pos2==right-1){
//             if(res.equals(totest)){
//                 return res;
//             }
//             else{
//                 return "";
//             }
//             // return res;
//         }
//         if(str.charAt(pos1)==totest.charAt(pos2)){
//             res+str.charAt(pos1)+recur(str,totest,pos1+1,pos2+1,right);
            
//         }
//         else{
//             recur(str,totest,pos1+1,pos2+2,right);
            
//         }
        
//     }

   
}

class Main {
    public static void main(String[] args) {
        // Input dictionary and main string
        List<String> dict = Arrays.asList("ale", "apple", "monkey", "plea");
        String totest = "abpcplea";

        // Track the longest matching word
        String longest = "";
        for (String word : dict) {
            if (isSubsequence(word, totest)) {
                //true or false , true means i got one of the possibilty but ye word ka len max 
                //to comapre the length with max_len possible 
                if (word.length() > longest.length()) {
                    longest = word;
                }
            }
        }

        // Output the result
        System.out.println( longest);
    }

    // Wrapper for recursive check
    public static boolean isSubsequence(String word, String totest) {
        //wordfromdict, totest,pointer1,pointwer2
        return isSubsequence1(word, totest, 0, 0);
    }

    // Recursive helper method
    private static boolean isSubsequence1(String word, String totest, int i, int j) {
        //
       
        if (i == word.length()) {
            return true;
        }

      
        if (j == totest.length()) {
            return false;
        }
// o se match started , ya contiue , ya skip , then if i am able to go through comple word length then i got that word done 
//else me agar totest hi khatam ho gaya to match down complete !!! then not possible we do not have enough element in totest ki wo pura match ho jaye  
        if (word.charAt(i) == s.charAt(j)) {
            return isSubsequence1(word, s, i + 1, j + 1);
        } else {
            return isSubsequence1(word, s, i, j + 1);
        }
    }
}
