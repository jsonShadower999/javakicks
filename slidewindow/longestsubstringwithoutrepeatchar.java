// nput: s = "geeksforgeeks"
// Output: 7 
// Explanation: The longest substrings without repeating characters are "eksforg” and "ksforge", with lengths of 7.

// Input: s = "aaa"
// Output: 1
// Explanation: The longest substring without repeating characters is "a"
// left = 0
// max_len = 0

// for right from 0 to s.length:
//     // Check for duplicates manually inside the current window
//     for i from left to right - 1:
//         if s.charAt(i) == s.charAt(right):
//             // Move left just after the duplicate
//             left = i + 1
//             break

//     max_len = max(max_len, right - left + 1)


//calculate window size
left=0;
right=1;

max_len_substring=1//0
while(right<s.length()){
    //compute for 1st window 
    if(s.charAt(right-1)==s.charAt(right)){ //here its wrong right check !!! would only check for 1 consecutive index position u need to maintain a seen arraylist 
        left=left+2
        //its repeating 


    }
    else{
        max_len_substring=max(max_len_substring,right-left+1)

    }
    right++;

}
return max_len_substring
------------------------------------------------------------------

int[] lastSeen = new int[256];  // store last seen indices
Arrays.fill(lastSeen, -1);      // initialize to -1

int left = 0;
int maxLen = 0;

for (int right = 0; right < s.length(); right++) {
    char c = s.charAt(right);

    // If character was seen in  window
    if (lastSeen[c] >= left) {
        left = lastSeen[c] + 1;  // move left just after the repeated char
    }

    lastSeen[c] = right;  // update last seen position
    maxLen = Math.max(maxLen, right - left + 1);
}
return maxLen 

