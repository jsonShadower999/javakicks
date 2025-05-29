class Node{
    int data ;
    Node next ;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
//smallest unit is created !!1
//stack 
//current state pointer

class Stack{
    Node head ;
    Stack(){
        this.head=null;
    }
    boolean isEmpty(){
        return this.head==null;
    }
    void push(int data){
        Node new_node=new Node(data);
        new_node.next=head;
        head=new_node


        
    }
    void pop(){
        //underflow
        if(isEmpty()){
            System.out.println("stack underflow");
            return ;

        }
        else{
            Node temp= head;
            head=head.next;
            temp=null;

        }
    }
}