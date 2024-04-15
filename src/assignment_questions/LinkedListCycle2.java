package assignment_questions;

public class LinkedListCycle2 {
    public static void main(String[] args) {

    }

    static ListNode detectCycle(ListNode head) {
        // we need to find the length of cycle
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }

        // if no cycle, return 0
        if (length == 0) {
            return null;
        }

        // find the starting node
        ListNode first = head;
        ListNode second = head;

        // move it ahead by length of the cycle times
        while (length > 0) {
            second = second.next;
            length--;
        }

        // keep moving both forward, they will meet at cycle start
        while (first != second) {
            first = first.next;
            second = second.next;
        }

        return first; // or second
    }

    static int lengthCycle (ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);

                return length;
            }
        }
        return 0;
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
