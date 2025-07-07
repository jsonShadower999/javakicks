// There are n trees in a forest. 
// The heights of the trees is stored in array tree[], 
// where tree[i] denotes the height of the ith tree in the forest. 
// If the ith tree is cut at a height H, then the wood collected is tree[i] - H,
//  provided tree[i] > H. If the total woods that needs to be collected is exactly equal to k, 
//  find the height H at which every tree should be cut (all trees have to be cut at the same height).
// If it is not possible then return -1 else return H.

// N=5
// k=4// what is want 
// tree[]={2,3,6,2,4}



// Array ko sort kro 
// fin the mid =as current target 
// sum_curr=0
// k=4
// while(sum_curr<k){
//     if(arr[i]>mid){
//         sum_curr=sum_curr+(arr[i]-mid)
//     }
// }


// Input:
// n = 5, k = 4
// tree[] = {2, 3, 6, 2, 4}
// Output: 3
// Explanation: Wood collected by cutting trees
// at height 3 = 0 + 0 + (6-3) + 0 + (4-3) = 4
// hence 3 is to be subtracted from all numbers.
// Since 2 is lesser than 3, nothing gets
// subtracted from it.


import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int n = 5;
        int k = 4;
        int[] tree = {2, 3, 6, 2, 4};

        Arrays.sort(tree);
        int low = 0;
        int high = tree[n - 1];
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long wood = getWood(tree, mid);// mid pe cut kr k result 
            if(wood==k){
                System.out.println(wood);
            }
            

            if (wood >= k) {
                //agar cut kia mid se n muje jyada cut hogaya , to todha uper se tree cut hoga for next time

               
                low = mid + 1;
            } else {
                // if abhi ki woods kam h  then i need to cut tree from base more to treekibaseline-1
                
                high = mid - 1;
            }
        }

        System.out.println(result);
    }

   
    static long getWood(int[] trees, int cutHeight) {
        long sum = 0;
        for (int height : trees) {
            if (height > cutHeight) {
                sum += height - cutHeight;
            }
        }
        return sum;
    }
}
