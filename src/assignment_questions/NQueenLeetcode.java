package assignment_questions;

import java.util.*;

public class NQueenLeetcode {
    public static void main(String[] args) {

    }

    public List<List<String>> solveNQueens (int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> ans = new ArrayList<>();
        queens (board, 0, ans);
        return ans;
    }

    static void queens (char[][] board, int row, List<List<String>> list) {
        // base case
        if (row ==  board.length) {
            list.add(display(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if(isSafe(board, row, col)) {
                board[row][col] = 'Q';
                queens(board, row + 1, list);
                board[row][col] = '.';
            }
        }
    }

    static List<String> display (char[][] board) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = new String(board[i]);
            list.add(row);
        }
        return list;
    }

    static boolean isSafe (char[][] board, int row, int col) {
        // vertically
        for (int i = 0; i < row; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 0; i <= maxLeft; i++) {
            if(board[row-i][col-i] == 'Q') {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 0; i <= maxRight; i++) {
            if(board[row-i][col+i] == 'Q') {
                return false;
            }
        }

        return true;
    }
}
