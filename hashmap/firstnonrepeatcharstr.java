// Input: s = "geeksforgeeks"
// Output: 'f'
// Explanation: 'f' is the first character in the string which does not repeat.
// found=false
// for(i=0 to n):
//    for(j=0 to n):
//      if(c[i]==c[j]):
//         found=true;
//         break;
//    if(!found):
//       return c[i];


public static void firstnonrepeatchar(String s){
    int len=s.length();

    for(int i=0;i<len;i++){
        boolean found=false;
        for(j=0;j<len;j++){
            if(s.charAt(i)==s.charAt(j) ){
                found=true;
                break;

            }
        }
        if(!found){
            return s.charAt(i);
        }
    }
    return "not found!!!"

}
