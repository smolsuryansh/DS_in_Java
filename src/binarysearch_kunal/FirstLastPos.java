package binarysearch_kunal;

import java.util.Arrays;

public class FirstLastPos {

    // Find the first and last position of element in sorted array, LEETCODE 34:
    static int[] FindFirstLastPos(int[] nums, int target){

        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        // int[] ans = {start, end}
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int search(int[] nums, int target, boolean findStartIndex){

        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if(findStartIndex){
                    end = mid - 1; // check first occurance on left side
                }
                else {
                    start = mid + 1; // check last occurance on right side
                }
            }
        }
        return ans;
    }

    static int[] BruteForce(int[] arr, int target) {
        int start = -1;
        int end = -1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                if(start == -1){
                    start = i;
                }
                end = i;
            }
        }
        return new int[]{start, end};
    }

    public static void main(String[] args) {
        int[] arr = {1,7,7,7,7,8,8,10};
        int target = 7;
        int[] ans = BruteForce(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
