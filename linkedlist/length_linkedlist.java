class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linklist {
    public static int countNodes(Node head) {
        int cnt = 0;
        Node curr = head;
        while (curr != null) {
            cnt++;
            curr = curr.next;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        System.out.println(countNodes(head));  // Output: 4
    }
}





 public static int findSize(Node head) {
        if (head == null) {
            return 0;
        }
        return 1 + findSize(head.next); // Recursive call
    }
