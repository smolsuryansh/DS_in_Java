package assignment_questions;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int arr[] = {2,4,5,6};
        int ans[] = productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        Arrays.fill(ans, 1);
        int current = 1;
        for(int i = 0; i < nums.length; i++) {
            ans[i] = ans[i] * current;
            current = current * nums[i];
        }
        current = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            ans[i] = ans[i] * current;
            current = current * nums[i];
        }
        return ans;
    }
}
