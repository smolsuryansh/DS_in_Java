package assignment_questions;

public class HammingDistance {
    // Leetcode 461
    static int hammingDistance(int x, int y) {
        int z = x ^ y;
        int hammydistance = 0;

        while (z != 0) {
            z = z & (z - 1);
            hammydistance++;
        }
        return hammydistance;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        System.out.println(hammingDistance(x, y));
    }
}
