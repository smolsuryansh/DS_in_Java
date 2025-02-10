package assignment_questions;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        int count = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentCount = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentCount++;
                }

                count = Math.max(count, currentCount);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {2, 20, 4, 10, 3, 4, 5};
        System.out.println(longestConsecutive(nums));

        HashSet<Integer> setTest = new HashSet<>();
        for (int num : nums) {
            setTest.add(num);
        }

        System.out.println(setTest);
    }
}
