package assignment_questions;

import linkedlist_kunal.SinglyLinkedList;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.LinkedList;

public class LinkedListCycle {
    // Leetcode 141
    public static void main(String[] args) {

    }

    static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    private class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
