// Input: arr[] = [1, 4, 5, 3, 7, 9]
// Output: 3
// maximum size subarray which is a increasing series
// variable window size question

left=0;
right=1;
maxlen=-1000;
while(right<arr.length){

    seriesvalid=true
    for(int i=left+1;i<=right;i++){
        if(!arr[i-1]<arr[i]){
            seriesvalid=false;
            break;
           // left++;

        // }
        // else{
        //     right++;
        // }

    }
    }
     if (seriesValid) {
        maxlen = Math.max(maxlen, right - left + 1);
        right++;
    } else {
        // Shrink window from the left
        left++;
        if (left == right) right++; // prevent stuck window
    }

   // maxlen=max(maxlen,right-left+1);

}
