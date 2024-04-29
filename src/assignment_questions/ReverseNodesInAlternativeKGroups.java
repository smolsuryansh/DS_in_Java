package assignment_questions;

public class ReverseNodesInAlternativeKGroups {
    public ListNode reverseAlternativeKGroup (ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        ListNode present = head;
        ListNode prev = null;

//        int remainingLength = listLength(head);
        while (present != null) {
            ListNode last = prev;
            ListNode newEnd = present;

            ListNode next = present.next;
            for (int i = 0; present != null && i < k; i++) {
                present.next = prev;
                prev = present;
                present = next;
                if (next != null) {
                    next = next.next;
                }
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = present;

//            prev = newEnd;

//            remainingLength = remainingLength - k;

            // skip the k nodes
            for (int i = 0; present != null && i < k; i++) {
                prev = present;
                present = present.next;
            }
        }
        return head;
    }

    public int listLength (ListNode head) {
        if (head == null) {
            return 0;
        }

        ListNode temp = head;
        int length = 0;

        while (temp != null) {
            length += 1;
            temp = temp.next;
        }
        return length;
    }

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
}
