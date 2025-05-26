// Input: S = "01212"
// Output: 3
// Explanation: The substring 012 is the smallest substring that contains the characters 0, 1 and 2.

// zeropointer=false;
// onepointer=false;
// twopointer=false;
// win_size=-10;
// i=0;
// while(i<S.length()):
   
//    if(s.charat(i)==0):
//        if(zeropointer==false):
//             zeropointer=true
//         else:
//             win_size++    

//    else if(s.charat(i)==1):
//        onepointer=true
//    else if(s.charat(i)==2):
//       twopinter=true 
//     win_size=max(win_size,i)  
//     if(zeropointer && onepointer && twopointer){
//         //all r true n
//         return win_size;

//     }


// window is variable length
// we need two pointer left n right 
// when to change left end : when u find all 012 in window already 
// for keeping track of finding n no of 012 i can use hashmap 


// public static int smallest_substring_len(s){
//     min_len_recorded=Integer.MAX_VALUE
//     left=o;
//     right=0;
//     HashMap<String,Integer> hmap=new HashMap<>();
//     while(right<s.length()){
//         hmap.put(hmap.getOrDefault(s.charAt(right),0)+1);
//         //updated my dict or tracker 
//         while hmap.get('0')>0 && hmap.get('1')>0 && hmap.get('2')>0{
//             //shorter of two windows 
//             min_len_recorderded=min(min_len_recorded,right-left+1)
//             //now i need shift in window 
//             hmap.get(s.charAt(left))--;
//             //result set updated 
//             left=left+1 ; //slided the window 


//         }


//     }
//     if(min_len_recorded!=Integer.MAX_VALUE){
//         return min_len_recorded;
//     }
//     else{
//         return -1 ;
//     }
// }
// import java.util.HashMap;



import java.util.HashMap;

public class Main {
    public static int smallest_substring_len(String s) {
        int min_len_recorded = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        HashMap<Character, Integer> hmap = new HashMap<>();

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            hmap.put(rightChar, hmap.getOrDefault(rightChar, 0) + 1);

            // Try shrinking the window as long as it contains '0', '1', and '2'
            while (hmap.getOrDefault('0', 0) > 0 &&
                   hmap.getOrDefault('1', 0) > 0 &&
                   hmap.getOrDefault('2', 0) > 0) {

                // ✅ Use +1 since right is currently inside the window
                min_len_recorded = Math.min(min_len_recorded, right - left + 1);

                // Shrink window from the left
                char leftChar = s.charAt(left);
                hmap.put(leftChar, hmap.get(leftChar) - 1);
                left++;
            }

            right++; // ✅ move right at the end of outer loop
        }

        return min_len_recorded != Integer.MAX_VALUE ? min_len_recorded : -1;
    }

   
}

   