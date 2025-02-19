package assignment_questions;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {0,2,0,3,1,0,1,3,2,1};
        int ans = trap(height);
        System.out.println(ans);

        System.out.println(-3 / 2);
    }

    static int trap(int[] height) {
        if (height.length == 0 || height == null) {
            return 0;
        }

        int res = 0;

        for (int i = 0; i < height.length; i++) {
            int leftMax = height[i];
            int rightMax = height[i];

            for (int j = 0; j < i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }

            for (int j = i + 1; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }

            res += Math.min(leftMax, rightMax) - height[i];
        }
        return res;
    }

    public static int trapPrefixSuffixApproach(int[] height) {
        if (height.length == 0 || height == null) {
            return 0;
        }

        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int res = 0;
        for (int i = 0; i < height.length; i++) {
            res += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return res;
    }

    public static int trapTwoPointersApproach(int[] height) {
        if (height.length == 0 || height == null) {
            return 0;
        }

        int start = 0;
        int end = height.length - 1;

        int leftMax = height[start];
        int rightMax = height[end];

        int res = 0;

        while(start < end) {
            if (leftMax < rightMax) {
                start++;
                leftMax = Math.max(leftMax, height[start]);
                res += leftMax - height[start];
            } else {
                end--;
                rightMax = Math.max(rightMax, height[end]);
                res += rightMax - height[end];
            }
        }

        return res;
    }
}
