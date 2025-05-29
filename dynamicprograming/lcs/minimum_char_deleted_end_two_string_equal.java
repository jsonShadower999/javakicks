Input: S1 = "abcd", S2 = "absefr" 
Output: 6 
Explanation: 
Characters {'d', 'c'} are deleted from the end of S1 and characters {'r', 'f', 'e', 's'} are deleted from the end of S2 to make the strings equal.
Input: S1 = "geeks", S2 = "geeksfor" 
Output: 3 
Explanation: 
Characters {'f', 'o', 'r'} are deleted from the end of S2


// func(S1,s2){
    
//     recur(s1,s2,len1,len2,0)
// }
// recur(s1,s2,len1,len2,operations){
//     min_operation=0;
//     if(len1==0||len2==0){
//         return min_operation

//     }
//     if(s1.charAt(len1-1)==s2.charAt(len2-1)){
//         recur(s1,s2,len1-1,len2-1)

//     }
//     else{
//         res1=1+recur(s1,s2,len1,len1-1)
//         res2=1+recur(s1,s2,len1-1,len2))


//     }
//     min_operation=min(min_operation,min(res1,res2))
    
   
// }

//here deletion is not allowded for between terms so this approch is wrong
//deletion from end is only allowded in continuos way only
//check for each char from starting if the sequence keep on matching increase both pointer 
//else u need tp perform operatipon for lens-commonpart_counter


public class Main{
    public stati void main(String[] args){
        System.out.println(minDeletionsFromEndToMakeEqual("abcd", "absefr"));     // Output: 6
        System.out.println(minDeletionsFromEndToMakeEqual("geeks", "geeksfor"));  // Output: 3
    }
        
    public static int mindeletionfromendonly(String s1, String s2){
        int miniteratio=Math.min(s1.length(),s2.length())
        int i=0;
        while(i<miniteratio  && s1.charAt(i)==s2.charAt(i)){
            i++;
        }
        return (s1.length()-i)+(s2.length()-i);
        }
}