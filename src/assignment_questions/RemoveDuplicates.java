package assignment_questions;

import java.util.Arrays;

public class RemoveDuplicates {
    // Leetcode 26

    static void removeDuplicate(int[] nums){
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
//        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        removeDuplicate(arr);
        System.out.println(Arrays.toString(arr));
    }
}
