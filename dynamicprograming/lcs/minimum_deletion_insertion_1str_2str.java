//i need to convert s1 to s2
//insertion can be done of s1 characters 
// Input: s1 = "heap", s2 = "pea" 
// Output: 3
// Explanation: Minimum Deletion = 2 and Minimum Insertion = 1
// p and h are deleted from the heap, and then p is inserted at the beginning. One thing to note, though p was required it was removed/deleted first from its position and then it was inserted into some other position. Thus, p contributes one to the deletion count and one to the insertion count.

// Input: s1 = "geeksforgeeks", s2 = "geeks"
// Output: 8
// Explanation: 8 deletions, i.e. remove all characters of the string "forgeeks".

// find the longest common substring 
// res=longestcommonsubstring 
// all the characher that not in lcs and its from s1 then uncomon={}
// then find all the substring from from uncomon =list_uncomon
// for i in list_uncomon :
//     insert each with formulated 


    //optimal choice 
    // mindeletion=len s1 -lcs length 
    // mininsertion=len s2- lcs length 


static int lcs(String S1 ,String S2 , int len1 , int len2){
    if(len1==0 ||len2==0){
        return 0;
    }
    if(s1.chaAt(len1-1)==s2.charAt6(len2-1)){
        
        return 1+lcs(S1 ,S2,len1-1,len2-1)
    }
    else{
       return Math.max( lcs(s1,s2,len1,len2-1)
        lcs(s1,s2,len1-1,len2))

    }

}
ans=lcs(s1,s2,len1,len2)
ans_final=(s1.length()-lcs)+(s2.length()-lcs)

