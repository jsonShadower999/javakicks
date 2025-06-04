// import java.util.*;
// // Input: s = "aaaaaaaaaaa"
// // Output: ba  
// // Explanation: Count consecutive characters: "aaaaaaaaaaa" → "a11".
// // Convert frequency to hexadecimal: "a11" → "ab".
// // Reverse the string: "ab" → "ba".

// // Input: s = "abc"
// // Output: 1c1b1a
// // Explanation: Convert to character-frequency format: "abc" → "a1b1c1".
// // Convert counts to hexadecimal (no change as 1 remains 1).
// // Reverse the string: "a1b1c1" → "1c1b1a".
// class Main {
//     public static void main(String[] args) {
//         String string1="aaaccdd";
//         int cnt_curr=1;
//         String res="";
//         //res="a1b2a2c2d2";
//         for(int i=0;i<string1.length()-1;i++){
//             if(string1.charAt(i)==string1.charAt(i+1)){
//                 cnt_curr=cnt_curr++;
               
                
//             }
            
//             else{
//                 res=res+string1.charAt(i-1)+cnt_curr;
                
//                     cnt_curr=1;
                
//             }
            
//           //  res=res+string1.charAt(i)+cnt_curr;
//             // else{
//             //     cnt_curr=0;
//             // }
            
            
//         }
//         System.out.println(res);
//         // for last index 
        
        
//     }
      
// }
class Main {
    public static void main(String[] args) {
        String input = "aaaccdd";
        StringBuilder encoded = new StringBuilder();
        
        int cnt = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                cnt++;
            } else {
                encoded.append(input.charAt(i - 1));
                encoded.append(cnt); // Convert count to hex
                cnt = 1;
            }
        }

        // Append the last character and its count
        encoded.append(input.charAt(input.length() - 1));
        encoded.append(cnt);

        // Reverse the final result
        String result = encoded.reverse().toString();
        System.out.println(result);
    }
}

