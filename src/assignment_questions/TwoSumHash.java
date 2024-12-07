package assignment_questions;

import java.util.HashMap;
import java.util.Map;

public class TwoSumHash {

    // neetcode 3, leetcode 1
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(num, i); // store the values to check in the future
        }
        return new int[]{};
    }
}
