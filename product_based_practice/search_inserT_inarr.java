/*nput: arr[] = [1, 3, 5, 6], k = 5
Output: 2
Explanation: Since 5 is found at index 2 as arr[2] = 5, the output is 2.

Input: arr[] = [1, 3, 5, 6], k = 2
Output: 1
Explanation: Since 2 is not present in the array but can be inserted at index 1 to make the array sorted.*/

class Main {
    public static void main(String[] args) {
        int arr[]={1,3,5,6};
        int k=4;
        int res1=searchinarr(arr,k);
        System.out.println(res1);
       
        
       
    }
    public static int searchinarr(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
            else if(arr[i]!=k && arr[i]>k){
                return i;
                // becoz i =pos-1 
                
            }
        }
        return -1;
    }
   
        
        
    
}
