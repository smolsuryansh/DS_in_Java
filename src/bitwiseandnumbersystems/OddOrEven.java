package bitwiseandnumbersystems;

public class OddOrEven {
    // Given a number n, find if its odd or even
    // Use AND operator
    static boolean isOdd(int n){
        return (n & 1) == 1; // n & 1 gives us the last digit of binary number
    }

    public static void main(String[] args) {
        int n = 67;
        System.out.println(isOdd(n));
    }
}
