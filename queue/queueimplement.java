// #enque 
// #dequeue#isEmpty#isfull#getfront#getrear

// queue 
// one insertion point  track1
// one deleteion point   track2
// node(data,p1front, p2rear)


class Node{
    int data ;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Oueue{
    private Node front ;
    private Node rear;
    public Queue(){
        this.front=this.rear=null;
    }
    public boolean isEmpty(){
        return this.front==null;
    }
    publi void enque(int data){
        //if queue is empty
        Node new_node=new Node(data);
        if(isEmpty()){
            front=rear=new_node;
            return;
        }
        //if not empty say 1 node
        rear.next=new_node
        //a new node is attached and this is said to be last node.... for that
        rear=new_node //declare newnode point as rear the nackest !!!


    }
    public void dequeue(){
        //if nothing in queue 
        if(isEmpty()){
            return;
        }
        //removal is from front
        Node temp=front;
        front=front.next;
        //if on doing so front become empty no node
        if(front==null){
            rear=null;
        }
    }
}

public class implementqueue{
    Queue<Integer> q=new LinkedList<>();
    public static boolean isEmpty(){
        return q.isEmpty();
    }
    public void enque(int data){
        q.add(data);
    }
    public void dequeue(){
        if(isEmpty()){
            return;
        }
        else{
            q.poll();
        }
    }
    public int getFront(){
        if(isEmpty){
            return -1;
        }
        else{
            return q.peek();
        }
    }
}
