// from the array choose pivot 
// left=[:pivot]
// right=[pivot+1:]
// at each step we will set pivot to correct position 

// elements less than pivot are left array 
// elements more than pivot are right array 



// partition{
//     pivot declare 
//     move the pivot to right position 
//}


def sorting(arr):
     if len(arr)<=1:
         return arr 

     pivot=Math.floor(arr[len(arr)/2])
     left=[ele for ele in arr if ele<pivot]
     right=[ele for ele in arr if ele>pivot]
     middle=[ele for ele in arr if ele==pivot]
     return sorting(left)+middle+sorting(right)



public class Sort {

    
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high); 
            //formulation of tree continues 

            
            quickSort(arr, low, pi - 1);  // Left part of a tree ko solve kro
            quickSort(arr, pi + 1, high); // Right part of tree ko solve kro
        }
    }

    // Partition method
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choose the last element as pivot
        int i = low - 1;        // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and pivot (arr[high])
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return partition index
    }

  
}
