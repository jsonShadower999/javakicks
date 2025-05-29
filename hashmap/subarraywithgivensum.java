// Input: arr[] = [15, 2, 4, 8, 9, 5, 10, 23], target = 23
// Output: [2, 5]
// Explanation: Sum of subarray arr[2...5] is 2 + 4 + 8 + 9 = 23.

// Input: arr[] = [1, 10, 4, 0, 3, 5], target = 7
// Output: [3, 5]
// Explanation: Sum of subarray arr[3...5] is 4 + 0 + 3 = 7.

// Input: arr[] = [1, 4], target = 0
// Output: [-1]

15
15+2=17 

// for i from 0 to n-1:
//     sum = 0
//     for j from i to n-1:
//         sum = sum + arr[j]
//         if sum == target:
//             return [i, j]
//         elif sum > target:
//             break
// return [-1]

// start = 0
// sum = 0

// for end from 0 to n-1:
//     sum = sum + arr[end] //window compute
    
//     while sum > target and start <= end:  /// window reduction & change 
//         sum = sum - arr[start]
//         start = start + 1
    
//     if sum == target:  ///if satisy then ress
//         return [start, end]
        
// return [-1]
