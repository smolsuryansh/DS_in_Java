package assignment_questions;

public class PalindromeLinkedList {
    // Leetcode 234
    static boolean isPalindrome(ListNode head) {
        // first find middle
        ListNode mid = middleNode(head);

        // reverse
        ListNode headSecond = reverseList(mid); // head of second half

        // storing the secondHead in temp head for rereversing
        ListNode reReverseHead = headSecond;

        // compare both halves
        while (head != null && headSecond != null) {
            if (head.val != headSecond.val) {
                break;
            }

            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(reReverseHead);

        // if u traverse through entire list, hence its a palindrome
        return head == null || headSecond == null; // if head == null or headSecond == null return true;
    }

    static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode present = head;
        ListNode prev = null;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;

            if(next != null) {
                next = next.next;
            }
        }
        return prev;
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
