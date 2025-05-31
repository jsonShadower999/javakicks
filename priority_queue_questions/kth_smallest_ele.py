# // Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
# // Output: 7

# // Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4 
# // Output: 10 
# // Use a max heap (store negatives) of size K.

# // Initially insert the first K elements.

# // For the remaining elements, if the current element is smaller than the largest in the heap, pop the largest and insert the current one.

# // In the end, the root of the heap is the K-th smallest element.



# // kth smallest 
# // //using priority queue of heapq in py 
# // so i will use max heap 
# // i will create a stack with k restricted length 
# // for(i=0 to k):
# //    stc.push(arr[i])
# // for(i=k+1 to n)   
# //    if(stc.top > ar[i]){
# //      stc.pop() 
# //      stc.push(ar[i])
# //    }
# // }
# // return stc.top()


# // max heap is not in python 
# // how to make it possible !!!
# // To simulate a max heap using a min heap, you:

# // Push -x instead of x

# // So the smallest -x (i.e., the largest actual value) is at the top

# // When retrieving, you return -heap[0] to get the original value back


import heapq

def kth_smallest(arr, k):
    # Step 1: Create a max heap using the first k elements
    max_heap = [-x for x in arr[:k]]
    heapq.heapify(max_heap)
    
    # Step 2: Process the remaining elements
    for i in range(k, len(arr)):
        if -max_heap[0] > arr[i]:
            heapq.heappop(max_heap)
            heapq.heappush(max_heap, -arr[i])
    
    # Step 3: Return the top (negated back) as K-th smallest
    return -max_heap[0]

# Test cases
print(kth_smallest([7, 10, 4, 3, 20, 15], 3))  # Output: 7
print(kth_smallest([7, 10, 4, 3, 20, 15], 4))  # Output: 10
