import heapq 
def kthlargest(arr,k):
    res=[]
    minheap=[]
    #k largest ele in min heap
    for i in range(len(arr)):
        if(len(minheap)<k):
            heapq.heappush(minheap,arr[i])
    #smallest is top of minheap  
    # if i get any no > top of minheap 
        elif arr[i]>minheap[0]:
            heapq.heappop(minheap)
            heapq.heappush(minheap,arr[i]) 
    return minheap[0]            
