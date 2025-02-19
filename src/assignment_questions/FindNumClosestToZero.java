package assignment_questions;

import java.util.Arrays;

public class FindNumClosestToZero {

    public static int findClosestNum(int[] nums) {
        int closest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (Math.abs(closest) == nums[i]) {
                closest = nums[i];
            }

            if (Math.abs(closest) > Math.abs(nums[i])) {
                closest = nums[i];
            }
        }
        return closest;
    }

    public static int findClosestNumOptional(int[] nums) {
        Arrays.sort(nums);

        int closest = nums[0];
        int start = 1;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (Math.abs(nums[mid]) < Math.abs(closest) || Math.abs(nums[mid]) == Math.abs(closest)) {
                closest = nums[mid];
            }

            if (nums[mid] < 0) {
                start++;
            } else if (Math.abs(nums[mid]) > 0) {
                end--;
            } else {
                return nums[mid];
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-2,1,4,8};
        System.out.println(findClosestNum(nums));

        int i = 0;
        int j = i + 1;
        while (i < 10) {
            i++;
            j++;
            System.out.println("i: " + i);
            System.out.println("j: " + j);
        }
    }
}
