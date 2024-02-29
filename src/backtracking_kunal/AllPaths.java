package backtracking_kunal;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        allPaths("", maze, 0, 0);
    }

    static void allPaths (String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[row][col]) {
            return;
        }

        // considering applying backtracking to code after this line
        maze[row][col] = false; // making changes to the maze

        if (row < maze.length - 1) {
            allPaths(p + 'D', maze, row + 1, col);
        }
        if (col < maze[0].length - 1) {
            allPaths(p + 'R', maze, row, col + 1);
        }
        if (row > 0) {
            allPaths(p + 'U', maze, row - 1, col);
        }
        if (col > 0) {
            allPaths(p + 'L', maze, row, col - 1);
        }

        // this is where the function will be over
        // so before the function gets removed, also remove the changes that were made by the function
        maze[row][col] = true; // making changes to the maze
    }
}
