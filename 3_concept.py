def addOneToNumber(arr):
    if arr[-1] == 9:
        ans = trailing_nine(arr)
    else:
        arr[-1] += 1
        ans = arr
    return checkforzeroinvalid(ans)

def trailing_nine(arr):
    n = len(arr)
    for i in range(n - 1, -1, -1):
        if arr[i] == 9:
            arr[i] = 0
        else:
            arr[i] += 1
            return arr
    return [1] + arr

def checkforzeroinvalid(arr):
    while len(arr) > 1 and arr[0] == 0:
        arr.pop(0)
    return arr
