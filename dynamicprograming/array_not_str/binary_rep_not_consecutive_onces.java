10001110
//dp solution need to ework!!!
// Input: n = 5
// Output: 5
// Explanation:
// Here are the non-negative integers <= 5 with their corresponding binary representations:
// 0 : 0
// 1 : 1
// 2 : 10
// 3 : 11
// 4 : 100
// 5 : 101
// Among them, only integer 3 disobeys the rule (two consecutive ones) and the other 5 satisfy the rule. 
//constraint curr==1 , next==1 not possible
count=0;
for(int i=0;i<=n;i++){
    binary_form=bin(i)
    bin_str_format=str(binary_form)
    for(int i=0;i<bin_str_format.length();i++){
        if(bin_str_format.charAt(i)==1 && bin_str_format.charAt(i+1)==1){
            break;
        }
    }
    count++;

}
return count;

public class Solution {
    public int countNonConsecutiveOnes(int n) {
        int count = 0;

        for (int i = 0; i <= n; i++) {
            String binStr = Integer.toBinaryString(i);
            boolean hasConsecutiveOnes = false;

            for (int j = 0; j < binStr.length() - 1; j++) {
                if (binStr.charAt(j) == '1' && binStr.charAt(j + 1) == '1') {
                    hasConsecutiveOnes = true;
                    break;
                }
            }

            if (!hasConsecutiveOnes) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 5;
        System.out.println(solution.countNonConsecutiveOnes(n)); // Output: 5
    }
}


// public class Solution {
//     public int findIntegers(int n) {
//         // Step 1: Precompute Fibonacci-like DP array
//         int[] dp = new int[32]; // We only need up to 32 bits for integers <= 2^31
//         dp[0] = 1;
//         dp[1] = 2;
//         for (int i = 2; i < 32; i++) {
//             dp[i] = dp[i - 1] + dp[i - 2];
//         }

//         // Step 2: Traverse through the bits of n and count valid numbers
//         int count = 0;
//         int prevBit = 0;  // To check consecutive 1's
//         for (int i = 30; i >= 0; i--) { // Iterate from MSB to LSB
//             // Check if the current bit is set in n
//             if ((n & (1 << i)) != 0) {
//                 count += dp[i];  // Add valid numbers of length i
//                 if (prevBit == 1) {
//                     return count;  // Break if consecutive 1's found
//                 }
//                 prevBit = 1;
//             } else {
//                 prevBit = 0;
//             }
//         }

//         // Step 3: If n itself is a valid number (no consecutive 1's)
//         return count + 1;
//     }

//     public static void main(String[] args) {
//         Solution solution = new Solution();
//         int n = 5;
//         System.out.println(solution.findIntegers(n));  // Output: 5
//     }
// }
