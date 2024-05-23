package assignment_questions;

public class SortColors {
    // Leetcode 75
    public void sortColors (int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        for (int i = 0; i <= right;) {
            if (nums[i] == 0) {
                swap (nums, i++, left++);
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap (nums, i, right--);
            }
        }
    }

    public void swap (int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
