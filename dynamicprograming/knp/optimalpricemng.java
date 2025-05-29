// l where special[i] is of size n + 1 where special[i][j] is the number of pieces of the jth item in the ith offer and special[i][n] (i.e., the last integer in the array) is the price of the ith offer.

// Return the lowest price you have to pay for exactly certain items as given, where you could make optimal use of the special offers. You are not allowed to buy more items than you want, even if that would lower the overall price. You could use any of the special offers as many times as you want.

 

// Example 1:

// Input: price = [2,5], special = [[3,0,5],[1,2,10]], needs = [3,2]
// Output: 14
// Explanation: There are two kinds of items, A and B. Their prices are $2 and $5 respectively. 
// In special offer 1, you can pay $5 for 3A and 0B
// In special offer 2, you can pay $10 for 1A and 2B. 
// You need to buy 3A and 2B, so you may pay $10 for 1A and 2B (special offer #2), and $4 for 2A.
// Example 2:


needs=[A needed , B needed ]

current_satisfaction=[A_in_bck,B_in_bck]
n=offer.length()
at each case till i reach nth point ::::
i will take the  ith offer for consideration = decision1 , changes current_satisfaction , needs , price_current
i will not take the ofeer for consideration =decision2 , changes current_satisfaction , needs , price_current 
res=math.min(decision1 ,decision2, actual_pay_per_item)


class Solution {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int current_satisfaction=[0,0]
        int offer_list_len=special.length
        recur(special , needs , current_satisfaction , current_cost_estimation,current_index_track_item_selected)
        //(,,[0,0],0)

        
    }
    public int   recur(special , needs , current_cost_estimation,current_index_track_item_selected){
        if(){

        }
        else{
            //if i applied the offer 
            int cost1=recur(specials ,needs-specials[current_index_track_item_selected].[:-1],current_cost_estimation+specials[current_index_track_item_selected][-1],current_index_track_item_selected++)
            int cost2=recur(specials,needs,current_index_track_item_selected++)

        }
        res=Math.min(cost1,cost2)
        for(int i in len(needs)){
            sum_pay_on_price=sum_pay_on_price+ needs[i]*price[i]
        }
        res_fina=lMath.min(res,sum_pay_on_price)
        return res_final
        
    }
       
}





// Track offers using current_index.

// At each step:

// Take the offer if valid → reduce needs, increase cost.

// Skip the offer → move to next offer.

// Compare:

// Taking this offer,

// Skipping this offer,

// Buying all items at original price (base case).

// Return the minimum cost.

import java.util.*;

class Solution {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return recur(price, special, needs, 0);
    }

    public int recur(List<Integer> price, List<List<Integer>> special, List<Integer> needs, int current_index) {
        int n = price.size();

        // Base case: no more offers, return total cost by buying at original price
        int minCost = 0;
        for (int i = 0; i < n; i++) {
            minCost += needs.get(i) * price.get(i);
        }

        if (current_index == special.size()) {
            return minCost; // No more offers to try
        }

        // Option 1: skip current offer
        int costSkip = recur(price, special, needs, current_index + 1);

        // Option 2: take current offer (if valid)
        List<Integer> offer = special.get(current_index);
        List<Integer> updatedNeeds = new ArrayList<>();
        boolean isValid = true;

        for (int i = 0; i < n; i++) {
            int remain = needs.get(i) - offer.get(i);
            if (remain < 0) {
                isValid = false;
                break;
            }
            updatedNeeds.add(remain);
        }

        int costTake = Integer.MAX_VALUE;
        if (isValid) {
            costTake = offer.get(n) + recur(price, special, updatedNeeds, current_index);
        }

        // Return the minimum of taking the offer, skipping it, and direct purchase
        return Math.min(minCost, Math.min(costSkip, costTake));
    }
}