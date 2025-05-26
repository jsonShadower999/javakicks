// Step 1: Find the Peak Element (Mountain Top)
// Use binary search to locate the index where the peak occurs.

// Step 2: Binary Search on the Increasing Side
// Step 3: Binary Search on the Decreasing Side
int searchInMountainArray(int[] arr, int target) {
    int peak = findPeakIndex(arr);

    int index = binarySearch(arr, 0, peak, target, true);
    if (index != -1) return index;

    return binarySearch(arr, peak + 1, arr.length - 1, target, false);
}

int findPeakIndex(int[] arr) {
    int left = 0, right = arr.length - 1;
    while (left < right) {
        int mid = (left + right) / 2;
        if (arr[mid] < arr[mid + 1]) {
            left = mid + 1; // go right
        } else {
            right = mid; // go left or mid
        }
    }
    return left;
}

int binarySearch(int[] arr, int left, int right, int target, boolean ascending) {
    while (left <= right) {
        int mid = (left + right) / 2;
        if (arr[mid] == target) return mid;

        if (ascending) {
            if (target < arr[mid]) right = mid - 1;
            else left = mid + 1;
        } else {
            if (target > arr[mid]) right = mid - 1;
            else left = mid + 1;
        }
    }
    return -1;
}
