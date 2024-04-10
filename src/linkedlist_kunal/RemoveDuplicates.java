package linkedlist_kunal;

public class RemoveDuplicates {
    // Leetcode 83
    public class Node {
        int val;
        Node next;

        public Node() {

        }
        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public RemoveDuplicates() {
        this.size = 0;
    }

    public void duplicates() {
        Node node = head; // start checking from head

        while (node.next != null) {
            if(node.val == node.next.val) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

//    public Node deleteDuplicates(Node head) {
//
//    }
}
