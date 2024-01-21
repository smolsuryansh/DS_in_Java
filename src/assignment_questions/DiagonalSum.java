package assignment_questions;

import java.util.Arrays;

public class DiagonalSum {
    // Leetcode 1572
    static int diagonalSum(int[][] mat){
        int row = 0;
        int col = mat.length - 1;
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            if(row==col){
                sum += mat[i][row]; // sum = 0 + element
            }
            else {
                int temp = mat[i][row] + mat[i][col];
                sum += temp;
            }
            row++;
            col--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int ans = diagonalSum(mat);
        System.out.println(ans);
    }
}
