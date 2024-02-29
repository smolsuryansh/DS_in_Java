package backtracking_kunal;

import java.util.Arrays;

public class PrintMatrixAndPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        int[][] path = new int[maze.length][maze[0].length]; // to have the same print path structure as the maze board

        printMatrixAndPaths("", maze, 0, 0, path, 1);
    }

    static void printMatrixAndPaths (String p, boolean[][] maze, int row, int col, int[][] path, int step) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            path[row][col] = step; // last step is also a step
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            // lets print the path as well
            System.out.println(p);

            System.out.println(); // makes the output cleaner
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        maze[row][col] = false;
        path[row][col] = step;

        if (row < maze.length - 1) {
            printMatrixAndPaths(p + 'D', maze, row + 1, col, path, step + 1);
        }
        if (col < maze[0].length - 1) {
            printMatrixAndPaths(p + 'R', maze, row, col + 1, path, step + 1);
        }
        if (row > 0) {
            printMatrixAndPaths(p + 'U', maze, row - 1, col, path, step + 1);
        }
        if (col > 0) {
            printMatrixAndPaths(p + 'L', maze, row, col - 1, path, step + 1);
        }

        maze[row][col] = true;
        path[row][col] = 0;
    }
}
