// Input: arr[] = {10, 12, 11, 15}, 
//        low = 10, high = 15
// Output: 13, 14
// Input: arr[] = {1, 14, 11, 51, 15}, 
//        low = 50, high = 55
// Output: 50, 52, 53, 54 55

// create arr2[]=range(low,high) 
// create a loop if ele in arr then remove it from aarr2 
// n return final arr2 
  public static void findMissingRange(int[] arr, int low, int high) {
        Set<Integer> present = new HashSet<>();
        for (int num : arr) {
            if (num >= low && num <= high) {
                present.add(num);
            }
        }

        List<Integer> missing = new ArrayList<>();
        for (int i = low; i <= high; i++) {
            if (!present.contains(i)) {
                missing.add(i);
            }
        }

        System.out.println("Missing numbers: " + missing);
    }