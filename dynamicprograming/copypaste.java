<<<<<<< HEAD
A

n=3 aaa

cpp
c=1 , p=2


n=1 

c=0 p=0

n=2 
c=1 p=1 

n=4
cppp
cpcp

c=1 , p=3 


class Solution(object):
    def minSteps(self, n):
        if(n==1){
            return 0
        }
        else{
            return n
        }
       
n=7
AAAAAAA
c=1 p=6
cppcp operation=5

///  ALGO LOGIC  !!!
// no of c p operations 
//if on A performing copy deciosion 1 no change in arr
//on A perform paste decision 2  an A will be added to strign 
//return min(decision1,decision2)

// public static int funcminimalresolver(int n){
//     String current_char_list="A"
//     recur(n,current_char_list,1)

// }
// public static int recur(int n, String current_char_list,int currentlen_charlist){
//     int cnt=0;
//     if(current_char_list.length()==n){
//         return cnt;

//     }
//     else{
//         paste_succes=recur(n,current_char_list.add("A"),currentlen_charlist++) +
//         copy_succes=recur(n,current_char_list,currentlen_charlist)
//         //whether copy or paste that will be called operation 
//     }
//     cnt=Math.min(paste_succes,copy_succes)


// }

// Input: n (target number of 'A's)
// You can either:
// - Copy All: decision 1 (clipboard = current, no change to screen)
// - Paste: decision 2 (add clipboard to screen)
// Goal: Reach n 'A's in minimum operations

public static int funcminimalresolver(int n){
    String current_char_list = "A";
    recur(n, current_char_list, 1);
}

public static int recur(int n, String current_char_list, int currentlen_charlist){
    int cnt = 0;
    if(current_char_list.length() == n){
        return cnt;
    } else {
        paste_succes = recur(n, current_char_list.add("A"), currentlen_charlist++) +
        copy_succes = recur(n, current_char_list, currentlen_charlist);
    }
    cnt = Math.min(paste_succes, copy_succes);
}


public int minSteps(int n) {
    int ans = 0;
    for (int d = 2; d <= n; d++) {
        while (n % d == 0) {
            ans += d;
            n /= d;
        }
    }
    return ans;
}













=======
A

n=3 aaa

cpp
c=1 , p=2


n=1 

c=0 p=0

n=2 
c=1 p=1 

n=4
cppp
cpcp

c=1 , p=3 


class Solution(object):
    def minSteps(self, n):
        if(n==1){
            return 0
        }
        else{
            return n
        }
       
n=7
AAAAAAA
c=1 p=6
cppcp operation=5

///  ALGO LOGIC  !!!
// no of c p operations 
//if on A performing copy deciosion 1 no change in arr
//on A perform paste decision 2  an A will be added to strign 
//return min(decision1,decision2)

// public static int funcminimalresolver(int n){
//     String current_char_list="A"
//     recur(n,current_char_list,1)

// }
// public static int recur(int n, String current_char_list,int currentlen_charlist){
//     int cnt=0;
//     if(current_char_list.length()==n){
//         return cnt;

//     }
//     else{
//         paste_succes=recur(n,current_char_list.add("A"),currentlen_charlist++) +
//         copy_succes=recur(n,current_char_list,currentlen_charlist)
//         //whether copy or paste that will be called operation 
//     }
//     cnt=Math.min(paste_succes,copy_succes)


// }

// Input: n (target number of 'A's)
// You can either:
// - Copy All: decision 1 (clipboard = current, no change to screen)
// - Paste: decision 2 (add clipboard to screen)
// Goal: Reach n 'A's in minimum operations

public static int funcminimalresolver(int n){
    String current_char_list = "A";
    recur(n, current_char_list, 1);
}

public static int recur(int n, String current_char_list, int currentlen_charlist){
    int cnt = 0;
    if(current_char_list.length() == n){
        return cnt;
    } else {
        paste_succes = recur(n, current_char_list.add("A"), currentlen_charlist++) +
        copy_succes = recur(n, current_char_list, currentlen_charlist);
    }
    cnt = Math.min(paste_succes, copy_succes);
}


public int minSteps(int n) {
    int ans = 0;
    for (int d = 2; d <= n; d++) {
        while (n % d == 0) {
            ans += d;
            n /= d;
        }
    }
    return ans;
}













>>>>>>> 0d7d62bbc9f558f57947273b200b32944b654392
