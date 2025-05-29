// Input: s = "aaaaabbbbbb"
// Output: ab
//remove only cosecutive dup
variable windoow question
window left right 
in window 
if consecurtive are equal ..add onces n do right ++
if consecutive are not equal 


public static String removeconsecutive_dups(String str){
    int left=0;
    int right=1;
    final_res=str.charAt(0);
    boolean firsttimedone=false;
    //think for a single window
    for(int i=right;i<str.length();i++){
        if(str.charAt(i-1)!=strcharAt(i) && firsttimedone==false){
            //if in win consecutive are equal
            res.add(str.charAt(i));
            firsttimedone=true

        }
         if(!final_res.equals(res)){
        final_res.add(res);
         }
       res="";
    }
   


         

   
}









Input: s = "aaaaabbbbbb"
Output: ab
Explanation: Remove consecutive duplicate characters from a string s  such as 5 a's are at consecative so only write a and same like that in b's condition.

Input: s = "geeksforgeeks"
Output: geksforgeks
Explanation: Remove consecutive duplicate characters from a string s such as ee are their hence remove one e.

Input: s = "aabccba"
Output: abcba
Explanation: In this 2 a's are at consecutive so 1 a's remove after that 2 c's are consecutive so one c remove .



for(i=0;i<n;i++){
    if(str.charat(i)===str.charat(i+1)){


    }
    else{
        res.add(str.charAt(i))
        res.add(str.charAt(i+1))
        i=i+2

    }
}
return res 

res = empty string
res.add(str.charAt(0))  // always include first character

for (i = 1; i < str.length(); i++) {
    if (str.charAt(i) != str.charAt(i - 1)) {
        res.add(str.charAt(i))  // only add if it's not same as previous
    }
}
return res


