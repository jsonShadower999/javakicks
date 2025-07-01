class Node{
    int data;
    Node next;
}
public class cnt_the_key{
    public static int count_fucn(Node head,int key){
        Node curr=head;
        int cnt=0;
        while(curr!=null){
            if(curr.data==key){
                cnt++;
            }
            curr=curr.next;
        }
        return cnt;
    }
}