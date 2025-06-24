//for each element 
//d1=pick the element 
//d2=move ahead and pick that subset 
// backrack  if the d1 or d2 set persist before not includ ein res 

List<List<Integer>> res_final=new ArrayList<>():
//  func_backtrack(start,array_to_rocess,current_set,final_result
fnc_backtrack(0,nums,new ArrayList<>();res_final);

private static void fnc_backtrack(int start , int[] nums , List<Integer> curr,List<List<Integer>> res_final){
    res_final.add(new ArrayList<>(curr));
    for(int i=start;i<nums.length;i++){// for each ele in consideration
        curr.add(nums[i]); //include the current element d1
        fnc_backtrack(i+1,nums,curr,res);//include from next index the set d2
        curr.remove(curr.size()-1);
        
    }
    
}