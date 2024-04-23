package assignment_questions;

import linkedlist_kunal.SinglyLinkedList;

// Leetcode 206
public class ReverseLinkedList {
    // in place reverse
    public void reverse() {
        if (size < 2) {
            return;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present != null) {
            present.next = prev;
            prev = present;
            present = next;

            if(next != null) {
                next = next.next;
            }
        }

        head = prev; // reverse
    }


    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
    private Node head;
    private int size;
    public ReverseLinkedList() {
        this.size = 0;
    }
}
