package backtracking_kunal;

import java.util.ArrayList;

public class DiagonalPaths {
    public static void main(String[] args) {
        System.out.println(pathListDiagonal("", 3, 3));
        pathDiagonal("", 3, 3);
    }

    static ArrayList<String> pathListDiagonal (String p, int row, int col) {
        if (row == 1 && col == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (row > 1 && col > 1) {
            list.addAll(pathListDiagonal(p + 'd', row - 1, col - 1)); // small d stands for diagonal
        }
        if (row > 1) {
            list.addAll(pathListDiagonal(p + 'V', row - 1, col));
        }

        if (col > 1) {
            list.addAll(pathListDiagonal(p + 'H', row, col - 1));
        }
        return list;
    }

    static void pathDiagonal (String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }

        if (row > 1 && col > 1) {
            pathDiagonal(p + 'd', row - 1, col - 1);
        }

        if (row > 1) {
            pathDiagonal(p + 'V', row - 1, col);
        }

        if (col > 1) {
            pathDiagonal(p + 'H', row, col - 1);
        }
    }
}
