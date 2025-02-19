package assignment_questions;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature {

    public static int[] dailyTemperaturesBrute(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 1;
            int j = i + 1;
            while (j < n) {
                if (temperatures[j] > temperatures[i]) {
                    break;
                }
                j++;
                count++;
            }
            count = (j == n) ? 0 : count;
            res[i] = count;
        }
        return res;
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<int[]> stack = new Stack<>(); // pair: [element, index]
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int t = temperatures[i];
            while (!stack.isEmpty() && t > stack.peek()[0]) {
                int[] pair = stack.pop();
                res[pair[1]] = i - pair[1];
            }
            stack.push(new int[] {t, i});
        }
        return res;
    }

    public static void main(String[] args) {
        int[] temperatures = {30,38,30,36,35,40,28};
        System.out.println(Arrays.toString(dailyTemperaturesBrute(temperatures)));
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
}
