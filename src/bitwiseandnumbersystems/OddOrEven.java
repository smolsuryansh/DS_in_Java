package bitwiseandnumbersystems;

public class OddOrEven {
    // Given a number n, find if its odd or even
    // Use AND operator
    static boolean isOdd(int n){
        return (n & 1) == 1; // n & 1 gives us the last digit of binary number
    }

    static String oddEven(int n) {
        if (((n & 1) == 1)) {
            return "Odd";
        } else {
            return "Even";
        }
    }

    public static void main(String[] args) {
        int n = 68;
        System.out.println(isOdd(n));
        System.out.println(oddEven(n));
    }
}
