package bitwiseandnumbersystems;

public class FindNumOfDigitsInBase {

    static int countDigits(int n) {
        int count = 0;

        while (n > 0) {
            int last = (n & 1);
            count += 1;
            // count += last; // 1111
            n = n >> 1;
        }
        return count;
    }

    static int formularCount(int n) {
        int base = 2;

        return (int) (Math.log(n) / Math.log(base)) + 1;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(64));
        System.out.println(formularCount(10));
    }
}
