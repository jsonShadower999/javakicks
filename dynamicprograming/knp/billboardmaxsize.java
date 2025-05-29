// Input: rods = [1,2,3,4,5,6]
// Output: 10
// Explanation: 
// We have two disjoint subsets {2,3,5} and {4,6},
//  which have the same sum = 10.

//ALGO TRIED!!!


// sequence not needed 
// max_sum=-inf
// for each case we can take a ele or leave it 
// take  decision1 = included some thing
// left  decision2 = included something 
// if(sum(take)==sum(left)){
//     sum_curr=sum(left)
//     max_sum=max(max_sum, sum_curr)

// }
// return max_sum 

public static int funcpillarsolver(int rods){
    recur(rods,0,0,0,0)

    //recur(rods,currentindex,sum1_pillar,sum2_pilalr)
}
public static recur(int rods[],int currentindex,int currentsum1,int currentsum2){
    int max_pillar_len=Integer.MIN_VALUE
    if(currentindex==rods.length){
        if(currentsum1==currentsum2){
            return  max_pillar_len;
        }
        else{
            return -1;
        }
       

    }
    else{
        int sum1=recur(rods,currentindex++,currentsum1+rods[currentindex],currentsum2)
        int sum2=recur(rods,currentindex++,currentsum1,currentsum2+rods[currentindex])
        int sum3=recur(rods,currentindex++,currentsum1,currentsum2)
        max_len_substring=max(max_pillar_len,Math.max(sum1,Math.max(sum2,sum3)))
       
    }
    
}








