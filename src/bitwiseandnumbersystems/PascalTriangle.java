package bitwiseandnumbersystems;

public class PascalTriangle {

    static void pascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int val = 1;

            for (int space = 0; space < n - i; space++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", val);
                val = val * (i - j) / (j + 1);
            }

            System.out.println("    |   Sum: " + (1 << (i)));
//            System.out.println(Integer.toBinaryString(1 << (i)));
        }
    }

    public static void main(String[] args) {
        pascalTriangle(5);
    }
}
