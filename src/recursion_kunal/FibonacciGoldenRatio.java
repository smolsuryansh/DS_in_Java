package recursion_kunal;

public class FibonacciGoldenRatio {

    // Time complexity: O( ((1 + sqrt5) / 2)pow(n) )
    static long fiboFormula(int n) {
        return (long) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            System.out.println(fiboFormula(i));
        }
    }
}
