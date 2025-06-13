//divide the array into two part 
//left to mid= left_part
//mid+1 to right =right_part 
// now i have two array u need to create a new array n insert from both the sorted solution in new array 


class sorter{
    public static void sortthearray(int arr[]){
        sortalgo(int arr[],0,,arr.lenght-1);
    }
    public static void sortalgo(int arr[] ,int start, int end ){
        // jab tak start n end are not same keep on split 
        if(start<end){
            int mid=left+(right-left)/2;
            sortalgo(int arr[], int start, int mid);
            sortalgo(int arr[], int mid+1,end);
            //spliting continues n tree form hua
            // just think of 1 sub problem ki hamare pass left array , right array n hamko naya array create krna h 
            funcsubproblemmerge(arr,left,mid,right);

        }
    }
    public static void funcsubproblemmerge(int arr[], int left , int mid, int right){
         //spliting continues n tree form hua
            // just think of 1 sub problem ki hamare pass left array , right array n hamko naya array create krna h 
        left_array_len=mid-left+1;
        right_arr_len=right-mid;
        for(int i=0;i<left_array_len;i++){
            left_arr=arr[left+i]; 

        }    
        for(int j=0;j<right_arr_len;j++){
            right_arr=arr[mid+j+1]; //mid+1 se right tk thats why  +1
        }
        //now left h , n right h
        int pointer1=0;
        int pointer2=0;
        int respointer=0;
        while(pointer1<left_array_len && pointer2<right_arr_len){
            if(left_arr[pointer1]<right_arr[pointer2]){
                res_arr[respointer]=left_arr[pointer1];
                pointer1++;
                
            }
            else{
                res_arr[respointer]=right_arr[pinter2];
                pointer2++;
            }
            respointer++;
        }
        if(pointer1<left_array_len){
            //left array h n right collapsed 
            while(pointer1<left_array_len){
                res_arr[respointer]=left_Arr[pointer1];
                respointer++;
                pointer1++;
            }
        }
        if(pointer2<right_array_len){
            //left array h n right collapsed 
            while(pointer2<right_array_len){
                res_arr[respointer]=right_Arr[pointer1];
                respointer++;
                pointer2++;
            }
        }

            
        
        
    }
}