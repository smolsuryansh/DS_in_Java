package assignment_questions;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet {

    public static void main(String[] args) {
        int target = 100;
        int[] position = {0, 2, 4};
        int[] speed = {4, 2, 1};
        System.out.println(carFleetIteration(target, position, speed));
        System.out.println(carFleet(target, position, speed));
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        // sort
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));

        Stack<Double> stack = new Stack<>();
        for (int[] p : pair) {
            double gap = (double) (target - p[0]) / p[1];
            stack.push(gap);

            if (stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)) {
                stack.pop();
            }
        }
        return stack.size();
    }

    public static int carFleetIteration(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }

        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
        
        int fleet = 1;
        double prevTime = (double) (target - pair[0][0]) / pair[0][1];
        for (int i = 1; i < n; i++) {
            double currTime = (double) (target - pair[i][0]) / pair[i][1];
            if (currTime > prevTime) {
                fleet++;
                prevTime = currTime;
            }
        }
        return fleet;
    }

}
