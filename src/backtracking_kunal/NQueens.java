package backtracking_kunal;

// Recurence relation: T(n) = n * T (n - 1) + O (n^2)
// Time Complexity: O(n^3 + n!) = O(n!)
public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        queens(board, 0);
    }

    static int queens (boolean[][] board, int row) {
        // not passing col in argument as we are always going to start from 0
        if (row == board.length) { // base
            // means all the queens have been places, display all the queens
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            // place the queen if its safe
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false; // backtracking
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if(board[i][col]) { // it means there is a queen there, not safe to place
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 0; i <= maxLeft; i++) {
            if(board[row-i][col-i]) { // row--, col--
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 0; i <= maxRight; i++) {
            if(board[row-i][col+i]) { // row--, col++
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
