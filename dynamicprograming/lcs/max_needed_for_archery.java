//hard !!!
//try again ,!!!

// class Solution {
//     public int[] maximumBobPoints(int numArrows, int[] aliceArrows) {
        
//     }
// }
// // Why can't Bob just shoot at the last 9 targets (index 11 to 3), one arrow each (just enough to beat Alice if possible), and win 47 points like in the sample output?
// // Why is that the only or best possible way?

// // Yes, in this case, shooting one arrow more than Alice on a carefully chosen set of high-point targets gives Bob the maximum score. But:

// // Not all greedy approaches like "last 9 targets" will always yield the best score.
// // hashmap={0:bobscore(0),nooftargetmade(0),1:,2:,11:}//hashmap


// // all total numarrows is count --->0 (this is no of chances u can take )
// // res1=bob shot kia , n thats a success ful shot scorechange=hashmap and make key as value , nooftargetmade++
// // res2=bob shot , n the shot was not succesful scorechage=0 , nooftargetmade++ , 
// // max(res1,res2)
// import java.util.*;

// class Solution {
//     Map<String, Object> bestResult = new HashMap<>();
//     int maxScore = 0;

//     public int[] maximumBobArrows(int numArrows, int[] aliceArrows) {
//         Map<String, Object> init = new HashMap<>();
//         init.put("score", 0);
//         init.put("shots", 0);
//         init.put("distribution", new int[12]);

//         dfs(0, numArrows, init, aliceArrows);
//         return (int[]) bestResult.get("distribution");
//     }

//     private void dfs(int start, int arrowsremain, Map<String, Object> current, int[] aliceArrows) {
//         if (start == 12) {
//             int score = (int) current.get("score");
//             if (score > maxScore) {
//                 maxScore = score;
//                 bestResult = new HashMap<>();
//                 bestResult.put("score", score);
//                 bestResult.put("shots", current.get("shots"));
//                 bestResult.put("distribution", ((int[]) current.get("distribution")).clone());
//             }
//             return;
//         }

//         int[] dist = (int[]) current.get("distribution");

//         // res1: Bob successfully beats Alice at this index
//         int required = aliceArrows[index] + 1;//min score needed
//         if (arrowsremains >= required) {//
//             dist[index] = required;
//             current.put("score", (int) current.get("score") + index);
//             current.put("shots", (int) current.get("shots") + required);

//             dfs(index + 1, arrowsLeft - required, current, aliceArrows);

//             // Backtrack
//             dist[index] = 0;
//             current.put("score", (int) current.get("score") - index);
//             current.put("shots", (int) current.get("shots") - required);
//         }

//         // res2: Bob skips the target
//         dfs(index + 1, arrowsLeft, current, aliceArrows);
//     }
// }
