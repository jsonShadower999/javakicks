public class Solution {

    public static int findAllSubarraysWithGivenSum(int[] arr, int s) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];  // manually summing instead of slicing
                }
                if (sum == s) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        int targetSum = 5;
        int result = findAllSubarraysWithGivenSum(arr, targetSum);
        System.out.println("Subarrays with sum " + targetSum + ": " + result);
    }
}
//timelimit exceed use hashset
