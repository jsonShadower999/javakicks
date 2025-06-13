#binary search 
#search the element in sorted array 
$time complexity log n 


ALGORITHM:::
in array find mid 
cmp mid==key ,mid<key decision1 , mid>key decision2 

keep on fiding the new mid n checking till key is found or size of array is >0



class Binarysearch{
    public static int binarySearch(int arr[] , int ele){
        int low=0;
        int high=arr.length-1 
        while(low<high){
            int mid=low+(high-low/2) 
            //start_point+delta_travel!!!
                return mid;
            }
            if(arr[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;

    
    }
}