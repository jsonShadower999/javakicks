// arr[]={1,2,4,5,7,8,3,2,1}
// ans=8


for(int i=0;i<n;i++){
    if(arr[i]-arr[i-1]>0 && arr[i]-arr[i+1]>0){
        return arr[i]
    }
}