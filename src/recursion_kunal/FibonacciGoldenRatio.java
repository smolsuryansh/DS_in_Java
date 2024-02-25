package recursion_kunal;

public class FibonacciGoldenRatio {

    // Time complexity: O( ((1 + sqrt5) / 2)pow(n) )
    static int fiboFormula(int n) {
        return (int) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 30; i++) {
            System.out.println(fiboFormula(i));
        }
    }
}
