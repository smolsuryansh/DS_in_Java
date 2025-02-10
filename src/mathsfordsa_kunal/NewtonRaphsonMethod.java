package mathsfordsa_kunal;

public class NewtonRaphsonMethod {

    public static double sqrt(double n) {
        double x = n;

        double root;

        while (true) {
            root = 0.5 * (x + (n / x)); // same as (x + (n / x) / 2

            if (Math.abs(root - x) < 0.5) {
                break; // break from the while loop
            }
            x = root;
        }

        return root;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }
}
