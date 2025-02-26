package assignment_questions;

public class SearchInA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int top = 0;
        int bot = ROWS - 1;

        while (top <= bot) {
            int rowMid = top + (bot - top) / 2;

            if (target > matrix[rowMid][COLS - 1]) {
                top = rowMid + 1;
            } else if (target < matrix[rowMid][0]) {
                bot = rowMid - 1;
            } else {
                break;
            }
        }

        if (!(top <= bot)) {
            return false;
        }

        int rowMid = top + (bot - top) / 2;
        int left = 0;
        int right = COLS - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target > matrix[rowMid][mid]) {
                left = mid + 1;
            } else if (target < matrix[rowMid][mid]) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean searchMatrixOnePass(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int left = 0;
        int right = ROWS * COLS - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int row = mid / COLS;
            int col = mid % COLS;

            if (target > matrix[row][col]) {
                left = mid + 1;
            } else if (target < matrix[row][col]) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
