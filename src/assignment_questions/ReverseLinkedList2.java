package assignment_questions;

public class ReverseLinkedList2 {
     public class ListNode {
         int val;
         ListNode next;
         ListNode() {

         }
         ListNode(int val) {
             this.val = val;
         }
         ListNode(int val, ListNode next) {
             this.val = val;
             this.next = next;
         }
    }

    static ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) {
            return head;
        }

        // skip the first left - 1 nodes
        ListNode present = head;
        ListNode prev = null;
        for (int i = 0; present != null && i < left - 1; i++) {
            prev = present;
            present = present.next;
        }
        
        ListNode last = prev;
        ListNode newEnd = present;
        
        // reverse b/w left and right
        ListNode next = present.next;
        for (int i = 0; present != null && i < right - left + 1; i++) {
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }
        }

        if(last != null)  {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = present;
        return head;
    }
}
