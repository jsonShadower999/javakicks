// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// delete the middle term 
class Node{
    int data;
    Node next;
}
class Main {
    public static Node deletemiddle(Node head){
        Node slower=head;
        Node faster=head;
        while(faster.next!=null && faster){
            slower=slower.next;
            faster=faster.next.next;
        }
        if(faster.next==null || !faster){
            return slower;
        }
        
    }
    public static void main(String[] args) {
        Node head=null;
        Node tail=null;
       
        for(int i=0;i<10;i++){
            Node newnode=new Node(i);
            if(head==null){
                head=newnode;
                tail=newnode;
            }
            else{
                //tail last wala node hai
                tail.next=newNode;
                newNode=tail;
            /// ab last node newnode hai
            
            }
            
        }
        Node deletednode=deletemiddle(head);
        Sytem.out.println("the deleted node is ::::");
        System.out.println(deletednode);
      
        
      
    }
}