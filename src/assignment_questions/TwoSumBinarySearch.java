package assignment_questions;

import java.util.Arrays;
import java.util.Comparator;

public class TwoSumBinarySearch {
    // Leetcode ques: 167

    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int[] ans = new int[2];

        while(start < end){
            // int mid = start + (end - start) / 2; DONT NEED THIS

            int sum = numbers[start] + numbers[end];

            if(sum == target){
                ans[0] = start + 1; // we changed the values' index by one so that
                ans[1] = end + 1; // it wont go out of bounds
                break;
            }
            else if (sum > target) {
                end = end - 1;
            } else {
                start = start + 1;
            }
        }
        return ans;
    }

    static int[] twoSumUnsortedArray(int[] nums, int target) {
        int[][] ans = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            ans[i][0] = nums[i];
            ans[i][1] = i;
        }

        Arrays.sort(ans, Comparator.comparingInt(a -> a[0]));

        int start = 0;
        int end = nums.length - 1;

        while(start < end) {
            int sum = ans[start][0] + ans[end][0];

            if (sum == target) {
                return new int[] {Math.min(ans[start][1], ans[end][1]), Math.max(ans[start][1], ans[end][1])};
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = {2,11,7,15,20};
        int target = 18;
        int[] ans = twoSum(arr, target);
        int[] ans1 = twoSumUnsortedArray(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans1));
    }
}
