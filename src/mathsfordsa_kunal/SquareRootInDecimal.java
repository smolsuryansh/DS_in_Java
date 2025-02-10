package mathsfordsa_kunal;

public class SquareRootInDecimal {

    public static double squareRoot(int num, int p) {
        int start = 0;
        int end = num;

        double root = 0.0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == num) {
                return mid;
            } else if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= num) {
                root += increment;
            }

            // when it breaks go back and minus
            root -= increment;
            increment /= 10;
        }

        return root;
    }

    public static void main(String[] args) {

        int num = 40;
        int p = 3;

        System.out.println(squareRoot(num, p));
        System.out.printf("%.3f", squareRoot(num, p));
    }
}
