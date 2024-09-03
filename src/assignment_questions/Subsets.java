package assignment_questions;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    // Leetcode 78

    static public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helperFunction(ans, new ArrayList<>(), nums, 0);
        return ans;
    }

    static private void helperFunction(List<List<Integer>> ans, List<Integer> currentSubset, int[] nums, int start) {
        ans.add(new ArrayList<>(currentSubset));

        for (int i = start; i < nums.length; i++) {
            currentSubset.add(nums[i]);
            helperFunction(ans, currentSubset, nums, i + 1);
            currentSubset.remove(currentSubset.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = subsets(nums);
        System.out.println(ans);
    }
}
