package mathsfordsa_kunal;

public class EuclideanAlgorithm {

    // find gcd/hcf
    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }

        return gcd(b % a, a);
    }

    // lcm
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(105, 224));
        System.out.println(lcm(2, 7));
    }
}
