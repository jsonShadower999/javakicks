// Input: strs = ["10","0001","111001","1","0"], m = 5, n = 3
// Output: 4
// Explanation: The largest subset with at most 5 0's and 3 1's is {"10", "0001", "1", "0"}, so the answer is 4.
// Other valid but smaller subsets include {"0001", "1"} and {"10", "1", "0"}.
// {"111001"} is an invalid subset because it contains 4 1's, greater than the maximum of 3.


strs,currr_index,res_set,m_curr,n_curr

public static int funczeronone(ArrayList<String> arrlist,int m, int n){
    recur(arrlist,0,"",m,n)
}
public static int recur(String arrlist, int currindex,ArrayList<String>res_set,int m,int n){
    if(){

    }
    else{
        //choosen the index for forecast
        no_ofones=arrlist[currindex].stream().filter(i=>i==1).count()
        no_ofzeroes=arrlist[currindex].length()-no_ofones
        ArrayList<String> ans1=recur(arrlist,currindex++,res_set.add(arrlist[currindex]),m-no_ofzeroes,n-no_ofones)
        ArrayList<String> ans2=recur(arrlist,currindex++,res_set,m,n)
        

    }
    max_set=ans1.length>ans2.length?ans1:ans2

}
import java.util.*;

public class Solution {

    public static int funczeronone(ArrayList<String> arrlist, int m, int n) {
        return recur(arrlist, 0, m, n);
    }

    public static int recur(ArrayList<String> arrlist, int currIndex, int m, int n) {
        if (currIndex == arrlist.size()) {
            return 0;
        }

        // Count 0s and 1s in current string
        String str = arrlist.get(currIndex);
        int count0 = 0, count1 = 0;
        for (char c : str.toCharArray()) {
            if (c == '0') count0++;
            else count1++;
        }

        int include = 0;
        // If we have enough m and n to include this string
        if (m >= count0 && n >= count1) {
            include = 1 + recur(arrlist, currIndex + 1, m - count0, n - count1);
        }

        // Skip the current string
        int exclude = recur(arrlist, currIndex + 1, m, n);

        // Return the max of including or excluding the string
        return Math.max(include, exclude);
    }

    public static void main(String[] args) {
        ArrayList<String> arrlist = new ArrayList<>(Arrays.asList("10", "0001", "111001", "1", "0"));
        int m = 5, n = 3;
        System.out.println(funczeronone(arrlist, m, n));  // Output: 4
    }
}
import java.util.*;

public class Solution {

    public static ArrayList<String> funczeronone(ArrayList<String> arrlist, int m, int n) {
        return recur(arrlist, 0, new ArrayList<>(), m, n);
    }

    public static ArrayList<String> recur(ArrayList<String> arrlist, int currIndex,
                                          ArrayList<String> currentSet, int m, int n) {
        if (currIndex == arrlist.size()) {
            return new ArrayList<>(currentSet); // Base case: return a copy of the set
        }

        String currentStr = arrlist.get(currIndex);
        int count0 = 0, count1 = 0;
        for (char c : currentStr.toCharArray()) {
            if (c == '0') count0++;
            else count1++;
        }

        ArrayList<String> includeSet = new ArrayList<>();
        // Include current string if possible
        if (m >= count0 && n >= count1) {
            ArrayList<String> newSet = new ArrayList<>(currentSet);
            newSet.add(currentStr);
            includeSet = recur(arrlist, currIndex + 1, newSet, m - count0, n - count1);
        }

        // Exclude current string
        ArrayList<String> excludeSet = recur(arrlist, currIndex + 1, new ArrayList<>(currentSet), m, n);

        // Return the set with the larger size
        return (includeSet.size() > excludeSet.size()) ? includeSet : excludeSet;
    }

    public static void main(String[] args) {
        ArrayList<String> arrlist = new ArrayList<>(Arrays.asList("10", "0001", "111001", "1", "0"));
        int m = 5, n = 3;
        ArrayList<String> resultSet = funczeronone(arrlist, m, n);
        System.out.println("Resulting Set: " + resultSet);
        System.out.println("Size: " + resultSet.size());  // Should print 4
    }
}
