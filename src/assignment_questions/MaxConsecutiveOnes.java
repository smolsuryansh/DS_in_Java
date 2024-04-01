package assignment_questions;

public class MaxConsecutiveOnes {
    // Leetcode 485
    static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result = 0;

        for (int x : nums) {
            count = (x == 0) ? 0 : count + 1;

            result = Math.max(count, result);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
