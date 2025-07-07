// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//{1,0,1} k=

k== noof o in array  return arr.len
k<noof o in array   u need to choose a part 
k>noof o in array return arr.len
class Main {
    public static void main(String[] args) {
        int k=3;
        int arr[]={1,1,0,0,1,0,0,1};
        int ans=find_max_one_seq(k,arr);
    }
    public static int find_max_one_seq(int k , int arr[]){
        // count 0 
        int left=0;
        int right=0;
        int max_len=0;
        int zero_cnt=0;
        while(right<arr.length){
            if(arr[right]==0){
                zero_cnt++;
            }
        }
        // agar zer_cnt 
        while(zero_cnt>k){
            // agar aisa h then ur max_len can vary in the sequence 
            if(arr[left]==0){
                zero_cnt--;
                // means i am taking that o in cnt aur fir 
            }
            left++;
        }
        max_len=Math.max(max_len,right-left+1);
        right++;
        
        
        
    }
    return max_len;
}