// // You are the manager of a basketball team. For the upcoming tournament, you want to choose the team with the highest overall score. The score of the team is the sum of scores of all the players in the team.

// // However, the basketball team is not allowed to have conflicts. A conflict exists if a younger player has a strictly higher score than an older player. A conflict does not occur between players of the same age.

// // Given two lists, scores and ages, where each scores[i] and ages[i] represents the score and age of the ith player, respectively, return the highest overall score of all possible basketball teams.

 

// // Example 1:

// // Input: scores = [1,3,5,10,15], ages = [1,2,3,4,5]
// // Output: 34
// // Explanation: You can choose all the players.
// // Example 2:

// // Input: scores = [4,5,6,5], ages = [2,1,2,1]
// // Output: 16
// // Explanation: It is best to choose the last 3 players. Notice that you are allowed to choose multiple people of the same age.

// //high_overall_score=0
// // at index i th 
// //the score is taken to process ===decision1
// //the score is not taken to process 
// //constraint age1>age2 score1>score2 if the score of the elder player is greater then remove that player 
// int max_score=0;
// for(int i=0;;i<n;i++){
//     if(age.i<age.i+1){
//         if(score.i<score.i+1){
//             max_score=max_score+score.i;
//             if()

//             //valid case

//         }
//         else{
//             //invalid case 
//             ages.remove(i+1)
//             scores.remove(i+1) 

//         }
//     }
// }

// Input: scores = [1,3,5,10,15], ages = [1,2,3,4,5]
// Output: 34
// Explanation: You can choose all the players.
// Example 2:

// Input: scores = [4,5,6,5], ages = [2,1,2,1]
// Output: 16
// Explanation: It is best to choose the last 3 players. Notice that you are allowed to choose multiple people of the same age.
// score=[5,5,4,6]

// age=[1,1,2,2]

// age will be in creasing order i know 
// //sort the age n reset the score array in same way
// if(age.i==age.i+1){
//     sum=sum+age.i+age.i+1

// }
// else if(age.i<age.i+1){
//     if(score.i<score.i+1){
//         sum=sum+score.i+1

//     }
//     else{
//         //nothing

//     }

// }

// sort 
//replace sort with hashmap n sort by age + score 
//then for each i i can take it ====> prev=currentindex
// else i will not keep i under selection --->prev remains same 
// if only one ele no previous 

import java.util.*;

class Solution {
    class Player {
        int age, score;
        Player(int age, int score) {
            this.age = age;
            this.score = score;
        }
    }

    public int bestTeamScore(int[] scores, int[] ages) {
        int n = scores.length;
        List<Player> players = new ArrayList<>();

        // Step 1: Create Player objects
        for (int i = 0; i < n; i++) {
            players.add(new Player(ages[i], scores[i]));
        }

        // Step 2: Sort by age, then score
        players.sort((a, b) -> {
            if (a.age == b.age) return a.score - b.score;
            return a.age - b.age;
        });

        // Step 3: Start recursion
        return recur(players, 0, -1);
    }

    // Recursive function
    // index: current player being considered
    // prev: index of previously picked player (or -1 if none picked)
    private int recur(List<Player> players, int index, int prev) {
        if (index == players.size()) return 0;

        // Option 1: skip current player
        int skip = recur(players, index + 1, prev);

        // Option 2: take current player if no conflict
        int take = 0;
        if (prev == -1 || players.get(index).score >= players.get(prev).score) {
            take = players.get(index).score + recur(players, index + 1, index);
        }

        return Math.max(skip, take);
    }
}