// Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4 
// Output : 39
// Explanation: We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.

// public static int func_find_max_subarray(int arr[],int k){
//     max=-Integer.MIN_VALUE;
//     for(int i=0;i<=n-k;i++){
//         sum=0
//         for(j=i;j<i+k;j++){
//             sum=sum+arr[j]


//         }
//         max=max(max,sum);


//     }
//     return max;
// }

public static int func_find_max_subarray(int arr[], int k) {
    int n = arr.length;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i <= n - k; i++) {
        int sum = 0;
        for (int j = i; j < i + k; j++) {
            sum = sum + arr[j];
        }
        if (sum > max) {
            max = sum;
        }
    }

    return max;
}

//OPTIMISE THE CODE 
//CONVERT THIS INNER LOOP TO WINDOW
public static int finc_optimised(int arr[] , int k){
    int n=arr.length;
    if(n<k) return -1 ;
    int max_sum=0;
    for(int i=0;i<k;i++){
        max_sum=max_sum+arr[i];
    }
    // calculation is done for 1st window 
   // not just store current computation n shift the window
   int win_sum=max_sum;
   for(int i=k;i<n;i++){
    win_sum=win_sum+arr[i]-arr[i-k];
    max_sum=Math.max(win_sum,max_sum); //shift the window 
   }
   return max_sum;
}



