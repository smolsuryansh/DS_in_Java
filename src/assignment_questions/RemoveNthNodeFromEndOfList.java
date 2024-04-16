package assignment_questions;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
       }
       ListNode(int val, ListNode next) {
           this.val = val; this.next = next;
       }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sHead = new ListNode(0, head);
        ListNode slow = sHead;
        ListNode fast = sHead;

        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return sHead.next;
    }
}
