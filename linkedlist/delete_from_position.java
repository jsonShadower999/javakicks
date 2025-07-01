// Fixed Java Code to Delete a Node at Given Position
//  N th node from last= len-n+1 node from begin 

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {
    public static Node deletion_linkedlist(Node head, int pos) {
        if (head == null) return null;

        if (pos == 1) {
            Node deleted = head;
            head = head.next;
            return deleted;
        }

        Node curr = head;
        Node prev = null;

        int cnt = 1;
        while (curr != null && cnt < pos) {
            prev = curr;
            curr = curr.next;
            cnt++;
        }

        if (curr == null) return null;  // Position out of bounds

        prev.next = curr.next;  // Skip over the node to delete
        return curr;            // Return deleted node
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        int pos = 3;
        Node deleted_node = deletion_linkedlist(head, pos);

        if (deleted_node != null)
            System.out.println("The deleted node is: " + deleted_node.data);
        else
            System.out.println("Position out of bounds or list is empty.");
    }
}
