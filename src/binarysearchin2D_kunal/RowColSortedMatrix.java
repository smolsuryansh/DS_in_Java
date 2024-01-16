package binarysearchin2D_kunal;

import java.util.Arrays;

public class RowColSortedMatrix {
    // Time Complexity: O(log(n) + log(m))

    // Search in the row provided between the columns provided
    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target){
        while(colStart <= colEnd){
            int mid = colStart + (colEnd - colStart) / 2;

            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }
            else if (matrix[row][mid] < target){
                colStart = mid + 1;
            }
            else {
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] searchSortedMatrix (int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){ // 0th row because the row is only one, hence first index
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        // Run the loop til 2 loops are remaining
        int rowStart = 0;
        int rowEnd = rows - 1;
        int colMid = cols/2;

        while(rowStart < (rowEnd - 1)){ // While this is true it will have more than 2 rows
            int mid = rowStart + (rowEnd - rowStart) / 2;

            if(matrix[mid][colMid] == target){
                return new int[]{mid, colMid};
            }

            else if(matrix[mid][colMid] < target){
                rowStart = mid; // because the target is bigger, we skip the above rows
            }
            else {
                rowEnd = mid; // otherwise the target is smaller, we skip the rows below
            }
        }

        // Now we have two rows
        // Check whether the target is in the columns of two remaining rows
        if(matrix[rowStart][colMid] == target){
            return new int[] {rowStart, colMid};
        }
        if(matrix[rowStart + 1][colMid] == target){ // rowEnd is going to be rowStart + 1 as there are only two rows remaining
            return new int[] {rowStart + 1, colMid};
        }

        // Otherwise search in the remaining 4 halves
        // 1st half
        if(target <= matrix[rowStart][colMid - 1]){ // top row left side
            return binarySearch(matrix, rowStart, 0, colMid - 1, target);
        }
        // 2nd half
        if(target >= matrix[rowStart][colMid + 1] && target <= matrix[rowStart][cols - 1]){ // top row right side, cols - 1 so that it stays in the same row
            return binarySearch(matrix, rowStart, colMid + 1,  cols - 1, target);
        }
        // 3rd half
        if(target <= matrix[rowStart + 1][colMid - 1]){ // bottom row left side
            return binarySearch(matrix, rowStart + 1, 0, colMid - 1, target);
        }
        // 4th half
        else { // top row right side
            return binarySearch(matrix, rowStart + 1, colMid + 1, cols - 1, target);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 8;
        int[] ans = searchSortedMatrix(matrix, target);
        System.out.println(Arrays.toString(ans));
    }
}
