package Patterns;

public class Pattern28 {
    static void pattern28(int n){
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row; // ? means then, : means otherwise

            int numOfSpaces = n - totalColsInRow;
            for (int spaces = 0; spaces < numOfSpaces; spaces++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern28(5);
    }
}
