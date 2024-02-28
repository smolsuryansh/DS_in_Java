package backtracking_kunal;

public class ObstacleMaze {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathObstacles("", maze, 0, 0);
    }

    static void pathObstacles (String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[row][col]) { // maze[row][col] == false
            return;
        }

        if (row < maze.length - 1) {
            pathObstacles(p + 'D', maze,row + 1, col);
        }

        if (col < maze[0].length - 1) {
            pathObstacles(p + 'R', maze, row, col + 1);
        }
    }
}
