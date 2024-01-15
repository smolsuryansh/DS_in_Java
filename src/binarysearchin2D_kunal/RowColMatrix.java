package binarysearchin2D_kunal;

import java.util.Arrays;

public class RowColMatrix {
    // Time complexity: O(N)
    static int[] SearchMatrix(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == target){
                return new int[] {row, col};
            }
            else if(matrix[row][col] < target) {
                row++; // if target is bigger that means elements in that row are not needed, hence row++
            }
            else {
                col--; // if target is smaller that means elements in that col are not needed, hence col--
            }
        }
        return new int[]{-1, -1}; // return -1, -1 if target not found
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 30},
                {15, 25, 35},
                {18, 27, 39}
        };
        int target = 27;
        int[] ans = SearchMatrix(matrix, target);
        System.out.println(Arrays.toString(ans));
    }
}
