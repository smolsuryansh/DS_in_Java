package linkedlist_kunal;

public class SinglyLinkedList {

    private Node head;
    private Node tail;

    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val); // created new node box
        node.next = head; // pointing this node to head
        head = node; // head always points to first node

        if (tail == null) {
            tail = head; // meaning there is only one node
        }

        size += 1;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
