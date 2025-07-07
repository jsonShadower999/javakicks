// Input: arr[] = [5, 4, 3]
// Output: 0
// Explanation: There is no pair that satisfies the given condition.
// Input: arr[] = [34, 8, 10, 3, 2, 80, 30, 33, 1]
// Output: 6
// Explanation: In the given array arr[1] < arr[7] satisfying the required condition(arr[i] < arr[j]) thus giving the 
class Main {
    public static void main(String[] args) {
        int arr[]={34, 8, 10, 3, 2, 80, 30, 33, 1};
        int max_diff=-1000;
        int store=0;
        int index_diff=0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    
                    store=arr[j]-arr[i];
                    index_diff=j-i;
                    
                }
                //int store=arr[j]-arr[i];
                // System.out.println(arr[j]);
                // System.out.println(arr[i]);
                
                max_diff=Math.max(max_diff,index_diff);
                
            }
        }
        System.out.println(max_diff);
        
    }
}