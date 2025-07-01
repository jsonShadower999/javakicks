//cicular hai thats why 
//last.next=head then its traversed fully 


class Node{
    int data;
    Node next;

}
public class cicular_resolver{
    public static void printlist(Node curr, Node head){
        if(head==null){
            return;
        }
        if(curr.next==head){
            return;
        }
        printlist(curr.next,head);
    }
}
public static void main(String[] args){
    Node head=new Node(11);
    head.next=new Node(12);
    head.next.next=new Node(31);
    head.next.next.next=new Node(90);
    head.next.next.next.next=head;
    cicular_resolver(head,head);
    
}