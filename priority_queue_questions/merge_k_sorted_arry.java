Input: K = 3, arr = { {1, 3, 5, 7}, {2, 4, 6, 8}, {0, 9, 10, 11}}
Output: 0 1 2 3 4 5 6 7 8 9 10 11 

Input: k = 4, arr = { {1}, {2, 4}, {3, 7, 9, 11}, {13} }
Output: 1 2 3 4 7 9 11 13

// creat a min heap with k size 
// for each time :
//    remove 1 element from each set if set is not empty 
//    put it in heap 
//    now make res=heap_content 
//    heap is empty now 

// public static ArrayList<Integer> mergeksortedarr(int arr[k][],int k){
//     PriorityQueue<Integer> pq=new PriorityQueue<>(k);
//     ArrayList<Integer> arr=new ArrayList<>();
//     for(int i=0,i<arr.length;i++){
//         curr_len_set=arr[i].length;
//         current_index=0 ;
//         pq.offer(arr[i][current_index]);
        

        
//     }
//     while(!pq.isEmpty){
//         arr.add(pq.pop());
//     }
//     current_index++;
// }

// {
//     row:
//     col:change after the each index min is extracted 
//     data:
// }
import java.util.*;
//make a new entity dict{row/col/val} and use it 
class Element implements Comparable<Element>{
    int val;
    int row;
    int col;
    public Element(int val , int row, int col){
        this.val=val;
        this.row=row;
        this.col=col;
    }
    public int compareTo(Element ele){
        return Integer.compare(this.value,ele.value)
    }

}
public class Mergeksorted{
    public static ArrayList<Integer> mergeksorted(int[][] arr, int k ){
        PriorityQueue<Element> pq= new PriorityQueue<>();
        ArrayList<Integer> res= new ArrayList<>();
        //insert 0 th ele of allset 
        for(int i=0;i<k;i++){
            if(arr[i].length>0){
                pq.offer(new Element(arr[i][0],i,0));
            }
        }
        //now after inserting first set element 
        //save its result
        //now update the currentindex
        while(!pq.isEmpty()){
            Element curr_ele=pq.poll();
            res.add(curr_ele.value);
            //ele row col val
            //next col 
            int next_track=curr.col +1;
            //if next col  is valid col then again do same 
            if(next_track<arr[curr.row].length){
                pq.offer(new Element(arr[curr.row][next_track],curr.row,next_track));

            }
        }
        return res;
    }
    
}
