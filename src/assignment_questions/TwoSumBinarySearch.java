package assignment_questions;

import java.util.Arrays;

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

    public static void main(String[] args) {
        int[] arr = {2,7,11,15,20};
        int target = 18;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
