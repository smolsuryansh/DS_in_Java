package assignment_questions;

import linkedlist_kunal.RemoveDuplicates;

public class RemoveDuplicatesFromLinkedList {
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

    public RemoveDuplicatesFromLinkedList() {
        this.size = 0;
    }

    static Node deleteDuplicates(Node node) {
        if (node == null) {
            return node;
        }

        Node head = node;
        while(node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}
