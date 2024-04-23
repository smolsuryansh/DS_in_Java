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

    // insert using recursion
    public void insertRecursion(int val, int index) {
        head = insertRecursion(val, index, head);
    }

    private Node insertRecursion(int val, int index, Node node) {
        if (index == 0) {
            Node temp = new Node(val, node);
            size++;
            return temp;
        }

        node.next = insertRecursion(val, index-1, node.next); // current node = whatever you have added in base and have returned
        return node;
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

    public void duplicates() {
        Node node = head; // start checking from head

        while (node.next != null) {
            if(node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
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

    public static SinglyLinkedList merge (SinglyLinkedList first, SinglyLinkedList second) {
        Node firstHead = first.head;
        Node secondHead = second.head;

        SinglyLinkedList ans = new SinglyLinkedList();

        while (firstHead != null && secondHead != null) {
            if (firstHead.value < secondHead.value) {
                ans.insertLast(firstHead.value);
                firstHead = firstHead.next;
            } else {
                ans.insertLast(secondHead.value);
                secondHead = secondHead.next;
            }
        }

        while(firstHead != null) {
            ans.insertLast(firstHead.value);
            firstHead = firstHead.next;
        }

        while (secondHead != null) {
            ans.insertLast(secondHead.value);
            secondHead = secondHead.next;
        }

        return ans;
    }

    // Bubble sort
    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {
        if (row == 0) {
            return;
        }

        if(col < row) {
            Node first = get(col);
            Node second = get(col + 1);

            if(first.value > second.value) {
                //swap
                if (first == head) { // first case
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) { // second case
                    Node prev = get(col - 1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else { // third case
                    Node prev = get(col - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col + 1);
        } else {
            bubbleSort(row - 1, col);
        }
    }

    // Reversing a linked list using recursion
    private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }

        reverse(node.next);

        // coming out of recursion call
        tail.next = node;
        tail = node;
        tail.next = null;
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

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(3);
        list.display();

        list.duplicates();
        list.display();
    }
}
