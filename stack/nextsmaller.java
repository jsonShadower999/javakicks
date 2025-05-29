// Input: [4, 8, 5, 2, 25]
// Output: [2, 5, 2, -1, -1]
// for(i=0 to n):
//   for(j =i+1 to n):
//       if(arr[j]<arr[i]):
//             newarr[i]=arr[j]
//             return;
//       else{
//         newarr[i]=-1;
//       }      
//       }


import java.util.*;

public class Solver {
    public static void nextSmaller(int arr[], int n) {
        ArrayList<Integer> arrStore = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    arrStore.add(arr[j]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                arrStore.add(-1); // No smaller element
            }
        }

        // Output the result
        System.out.println("Next Smaller Elements: " + arrStore);
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 25};
        nextSmaller(arr, arr.length);
    }
}
