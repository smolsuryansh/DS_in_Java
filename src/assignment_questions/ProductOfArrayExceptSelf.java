package assignment_questions;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6};
        int ans[] = productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(productExceptSelfDivision(arr)));
    }

    // brute force
    public static int[] productExceptSelfBrute(int[] nums) {

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product = product * nums[j];
                }
            }
            ans[i] = product;
        }
        return ans;
    }

    // optimized
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

    // using division operator
    public static int[] productExceptSelfDivision(int[] nums) {
        int ans[] = new int[nums.length];
        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            Arrays.fill(ans, product);
        }

        for (int i = 0; i < ans.length; i++) {
            ans[i] = ans[i] / nums[i];
        }

        return ans;
    }
}
