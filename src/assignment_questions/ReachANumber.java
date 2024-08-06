package assignment_questions;

public class ReachANumber {
    // Leetcode 754, Reach a number

    public static void main(String[] args) {
        int target = 6;
        int ans = reachNumber(target);
        System.out.println(ans);
    }

    static int reachNumber(int target) {
        target = Math.abs(target);
        int start = 1;
        int end = target;
        int steps = 0;
        int pos = 0;
        long sum = 0;

        while(start <= end) {
            int mid = start+(end - start) / 2;
            sum = (long)mid * (mid+1)/2;

            if(sum>=target) {
                pos = (int)sum;
                steps = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        while ((pos - target) % 2 != 0) {
            steps++;
            pos = pos + steps;
        }

        return steps;
    }
}
