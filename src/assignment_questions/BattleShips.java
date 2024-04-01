package assignment_questions;

import org.w3c.dom.ls.LSOutput;

public class BattleShips {
    public static void main(String[] args) {
        char[][] board =
                {{'X','.','.','X'},
                {'.','.','.','X'},
                {'.','.','.','X'}};

        System.out.println(countBattleships(board));
    }

    static int countBattleships(char[][] board) {
        int count = 0;

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                if (board[r][c] == '.') {
                    continue;
                }

                if ((r == 0 || board[r-1][c] != 'X') && (c == 0 || board[r][c-1] != 'X')) {
                    count++;
                }
            }
        }
        return count;
    }
}
