// Input: N = 3, cost[][3] = {{14, 2, 11}, {11, 14, 5}, {14, 3, 10}}
// Output: 10
// Explanation: 
// Paint house 0 as blue. Cost = 2. Paint house 1 as green. Cost = 5. Paint house 2 as blue. Cost = 3.
// Therefore, the total cost = 2 + 5 + 3 = 10.


// circular 
// int c=for each case u can choose the wall to paint with red= decision1 , next+2
//                     choose the wall to paint with blue =decision2 ,next+2
//                      choose to paint with green   =decision3 ,next+2



// for(int i=0;i<n;i++){
//     for()
// }
public static void mincostpaint(int cost[][],int n){
    if(n==0){
        return;
    }
    //decision1//let at index o that is for house 1 i painted with red color
    int prev_red=cost[0][0]
    //decision2 //let i painted with blue 
    int prev_blue=cost[0][1];
    int prev_green=cost[0][2];//decision3 
    //now for the first i have made decision 
    //lets think about second onward 
    int current_red;// if i selected red for second then  how it is possible n valid cse
    int current_blue;
    int current_green;
    for(int i=1;i<n;i++){
        //valid case1
        //painted with red
        current_red=cost[i][0]+Math.min(prev_blue,prev_green)
        current_blue=cost[i][1]+Math.min(prev_red,prev_green)
        current_green=cost[i][0]+Math.min(prev_red,prev_blue)
        //now the second is also done n for third wall paint it will consider second as previous 
        prev_red=current_red;
        prev_blue=current_blue;
        prev_green=current_green;


    }
    //now at the last wall last wall is in prev
    sopln(Math.min(prev_blue,Math.min(prev_green,prev_red)));

    }
    
    



