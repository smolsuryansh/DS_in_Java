package assignment_questions;

public class ContainerWithMostWater {

    public static int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int max = 0;

        while(start < end) {
            int area = Math.min(heights[start], heights[end]) * (end - start);
            max = Math.max(max, area);

            if (heights[start] <= heights[end]) {
                start++;
            } else {
                end--;
            }
        }

        return max;
    }

    public static int maxAreaBrute(int[] heights) {
        int max = 0;

        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                max = Math.max(max, Math.min(heights[i], heights[j]) * (j - i));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {0,2,0,3,1,0,1,3,2,1};
        System.out.println(maxAreaBrute(height));
    }
}
