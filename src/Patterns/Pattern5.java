package Patterns;

public class Pattern5 {
    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row; // ? means then, : means otherwise
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern5(5);
    }
}
