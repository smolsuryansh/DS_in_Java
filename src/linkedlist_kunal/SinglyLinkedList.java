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

    public void insertLast(int val) {

        if(tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head; // start checking from head
        for (int i = 1; i < index; i++) { // if index is 3 for to 2
            temp = temp.next;
        }

        Node node = new Node(val, temp.next); // temp.next means next element
        temp.next = node; // now temp.next will be the new created node
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get (index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }

    public Node find (int value) { // get reference pointer of particular nodes
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null; // means did find the value
    }

    public Node get (int index) { // get reference pointer of particular nodes
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2); // second last element
        int val = tail.value;

        tail = secondLast;
        tail.next = null;

        return val;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;

        if(head == null) {
            tail = null;
        }
        size--;
        return val;
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
