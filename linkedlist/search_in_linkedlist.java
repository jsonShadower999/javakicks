class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class search_in_linkedlist{
    public static boolean searchkey(Node head, int searchkey){
        Node curr=head;
        while(curr!=null){
            if(curr.data==searchkey){
                return true;
            }
            curr=curr.next;
        }
        return false;
    }
    public static void main(String[] args){
        
    }
}