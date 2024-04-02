package assignment_questions;

public class IslandPerimeter {
    // leetcode 463
    public static void main(String[] args) {

    }

    private final static int[][] DIRECTIONS = {
        {-1,0},{1,0},{0,-1},{0,1}
    };

    static int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if(grid[row][col] == 1) {
                    perimeter += 4 - getNumAdjacentLand(row, col, grid);
                }
            }
        }
        return perimeter;
    }

    static int getNumAdjacentLand(int row, int col, int[][] grid) {
        int lands = 0;

        for (int[] d : DIRECTIONS) {
            int newRow = row + d[0];
            int newCol = col + d[1];

            if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[row].length && grid[newRow][newCol] == 1) {
                lands++;
            }
        }

        return lands;
    }
}
