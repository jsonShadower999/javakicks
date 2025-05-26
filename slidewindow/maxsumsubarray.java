// Input: arr[] = [1, 2, 3, 4, 5], sum = 11
// Output: 10
// Explanation: Subarray having maximum sum is [1, 2, 3, 4]

window
sum less than equal target 

variable len window problem 

left=0

max_sum=arr[left] //0
sum_current=arr[left] //0
while(right<arr.length){
   
    while(sum<=targetsum){
         sum=sum+arr[right]

    }
    max_sum=max(max_sum,sum)



}
return max_sum
--------------------------------------------------
left = 0
right = 0
sum = 0
max_sum = Integer.MIN_VALUE

while (right < arr.length) {
    sum += arr[right] //for window compute 

    while (sum > target && left <= right) { // condition when to change window size do shifting
        sum -= arr[left]
        left++
    }

    if (sum <= target) {
        max_sum = max(max_sum, sum)
    }
    right++
}


   static int findMaxSubarraySum(int[] arr, int sum)
    {
        int result = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += arr[j];

                if (currSum < sum) {
                    result = Math.max(result, currSum);
                }
            }
        }
        return result;
    }
