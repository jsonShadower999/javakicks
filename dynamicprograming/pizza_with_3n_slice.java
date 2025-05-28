// alice me bob 

// how many slixce you eat


// Input: slices = [1,2,3,4,5,6]
// Output: 10
// Explanation: Pick pizza slice of size 4, Alice and Bob will pick slices with size 3 and 5 respectively. Then Pick slices with size 6, finally
//  Alice and Bob will pick slice of size 2 and 1 respectively. Total = 4 + 6.


// spliting 
// n if one selected the slice no other can choose 

// if u selected i th then u can not select i+1th and i-1th and array is circular 

// 1 to 6 size 
// max_sum=int.min
// for each index ::::
// 1 ---3 --5 decision 1 
// 2--4--6  decision2 
// max_sum=max(decision1 , decision2)

// U NEED TO HANDLE CIRCULAR NATURE 
// at a timespan only three index are under selection process



class Solution {
    public int maxSizeSlices(int[] slices) {
        // Try two cases: exclude first or exclude last slice (because circular array)
        return Math.max(
          //  So, if you pick index 0, you can't pick index 5. That's what makes things tricky.
            //recur(slices,current_index,current_sum,division_boundary,actual _len)
             //first and last elements are never chosen together
            recur(slices, 0, 0, slices.length / 3, slices.length - 1), // exclude last
            recur(slices, 1, 0, slices.length / 3, slices.length)      // exclude first
        );
    }

    // Recursive function to explore max sum
    // startIndex: where to start
    // current_index: current position in the array
    // slicesLeft: how many slices we can still pick
    // end: exclusive end index for linear subarray
    public int recur(int[] slices, int current_index, int current_sum, int slicesLeft, int end) {
        // Base cases
        //if all division boundary are done return sum 
        if (slicesLeft == 0) return current_sum;
        if (current_index >= end) return 0;

        // Option 1: take current slice and skip the next
        int take = recur(slices, current_index + 2, current_sum + slices[current_index], slicesLeft - 1, end);

        // Option 2: skip current slice
        int skip = recur(slices, current_index + 1, current_sum, slicesLeft, end);

        // Return the better of the two choices
        return Math.max(take, skip);
    }
}
