package bitwiseandnumbersystems;

public class FindXorOnRange {

    static int xorFull(int a) {

        if (a % 4 == 0) {
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }
        if (a % 4 == 2) {
            return a + 1;
        }

        return 0;
    }

    static int xorRange(int a, int b) {
        return xorFull(b) ^ xorFull(a - 1);
    }

    public static void main(String[] args) {
        int a = 9;
        for (int i = 0; i <= a; i++) {
            System.out.print(xorFull(i) + " ^ ");
        }
        System.out.print("End");
    }
}
