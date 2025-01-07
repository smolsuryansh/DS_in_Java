package assignment_questions;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public static boolean validSudoku(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            Set<Character> set = new HashSet<>();

            for (int i = 0; i < 9; i++) {
                if (board[row][i] == '.') {
                    continue;
                }
                if (set.contains(board[row][i])) {
                    return false;
                }
                set.add(board[row][i]);
            }
        }

        for (int col = 0; col < board.length; col++) {
            Set<Character> set = new HashSet<>();

            for (int i = 0; i < 9; i++) {
                if (board[i][col] == '.') {
                    continue;
                }
                if (set.contains(board[i][col])) {
                    return false;
                }
                set.add(board[i][col]);
            }
        }

        for (int square = 0; square < board.length; square++) {
            Set<Character> set = new HashSet<>();

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;

                    if (board[row][col] == '.') {
                        continue;
                    }
                    if (set.contains(board[row][col])) {
                        return false;
                    }
                    set.add(board[row][col]);
                }
            }
        }

        return true;
    }
}
