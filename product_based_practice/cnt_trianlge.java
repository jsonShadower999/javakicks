// Online Java Compiler
// Use this editor to write, compile and run your Java code online
12345
class Main {
    public static int cnt_triangle(int[] arr){
        Arrays.sort(arr);
        int cnt=0;
        //the third /largest,make that moving 
        for(int third=arr.length-1;third>=2;third--){
            int first=0;
            int second=third-1;
            // till the first n second are differenet n not acrross mid 
            while(first<second){
                if(arr[first]+arr[second]>arr[third]){
                    // from second to one all will be valid set kyoki array is sorted array
                    // becoz it sorted to if first proof it self with static asecond all first till second will also 
                    cnt=cnt+(second-first);
                    second--;
                }
                else{
                    first++;
                    //becoz taking first n finding valid trianlg eis not possible its a sorted array 
                }
            }
            
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        cnt_triangle(arr);
       
    }
}