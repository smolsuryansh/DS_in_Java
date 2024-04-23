package assignment_questions;

public class HappyNumber {
    // Leetcode 202
    public static void main(String[] args) {

    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow); // one step
            fast = findSquare(findSquare(fast)); // two steps
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }

    private int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number = number / 10;
        }
        return ans;
    }
}
