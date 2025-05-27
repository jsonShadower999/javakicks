// Input: arr[] = [0, -1, 2, -3, 1], target = -2
// Output: true

// a+b=-2
// a=sum-(for)
// for(i=0 to n):
//    if(target-a[i]===a[i]):
//       return true

public class TwoSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        ArrayList<Integer> arrList = new ArrayList<>();

        // Fill the ArrayList from array
        for (int num : arr) {
            arrList.add(num);
        }

        for (int i = 0; i < arrList.size(); i++) {
            int current = arrList.get(i);
            int complement = target - current;

            // Check if the complement exists, and make sure it's not the same element
            for (int j = 0; j < arrList.size(); j++) {
                if (i != j && arrList.get(j) == complement) {
                    return true;
                }
            }
        }
    }
}
  public static boolean hasPairWithSum(int[] arr, int target) {
        Set<Integer> sh = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;
            if (sh.contains(complement)) {
                return true;
            }
            sh.add(num);
        }

        return false;
    }
