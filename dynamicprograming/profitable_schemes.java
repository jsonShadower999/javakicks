// commit a crime 
// group[i] for ith cirime require groupi members 
// profit[i]

// least amt of profit === minprofit 


// Input: n = 10, minProfit = 5, group = [2,3,5], profit = [6,7,8]
// Output: 7
// Explanation: To make a profit of at least 5, the group could commit any crimes, as long as they commit one.
// There are 7 possible schemes: (0), (1), (2), (0,1), (0,2), (1,2), and (0,1,2).
 

//  class Solution {
//     public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
//         if(current_index==group.length){
//             return times_found;

//         }
//         else{
//         //for the grp i will choose the index ==decision 1
//         //for the grp at index i , not chossing it ==decision2 
//         //if(minprofit===followeddecision1 ) cnt++
//        int times_found=0; 
// i am including the ele n not including , but at the last of the both decision i need to check if the path 1 or path 2 is capable of currval>=profiit thats the base of all split 
// else i will just ignore that path of discovery ....
//        int value_genc1= recur(int n,int minProfit int[] group , int current_val+profit[current_index], int current_index , int[] profit )
//        int value_genc2= recur(int n,int minProfit int[] group , int current_val+profit[current_index], int current_index , int[] profit )
//        if(value_genc1>=minProfit ){
//         times_found++;

//        }
//        else if(value_genc2>=minProfit){
//         times_found++;

//        }
//         }
         

        
//     }
//}


class Solution {
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        return recur(n, minProfit, group, profit, 0, 0, 0);
    }

    // Recursive function matching your original style
    private int recur(int n, int minProfit, int[] group, int[] profit, int current_val, int current_index, int members_used) {
        if (members_used > n) return 0; // invalid scheme, over the limit

        if (current_index == group.length) {
            return current_val >= minProfit ? 1 : 0; // base case
        }

        int times_found = 0;

        // Decision 1: choose the current crime
        times_found += recur(n, minProfit, group, profit,
                             current_val + profit[current_index],
                             current_index + 1,
                             members_used + group[current_index]);

        // Decision 2: skip the current crime
        times_found += recur(n, minProfit, group, profit,
                             current_val,
                             current_index + 1,
                             members_used);

        return times_found;
    }
}
