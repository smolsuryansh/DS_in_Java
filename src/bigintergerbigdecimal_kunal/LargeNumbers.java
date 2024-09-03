package bigintergerbigdecimal_kunal;

import java.math.BigDecimal;
import java.math.BigInteger;

public class LargeNumbers {
    public static void main(String[] args) {

        // BIG INTEGERS
        System.out.println("BIG INTERGERS: ");
        int a = 40;
        int b = 57;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(69);
        BigInteger C = new BigInteger("323567565676524239090546");
        BigInteger E = new BigInteger("238964245742");

        // constants
        BigInteger D = BigInteger.TEN;

        BigInteger sum = A.add(B);

        if(C.compareTo(E) < 0) {
            System.out.println("Yes");
        } else {
            System.out.println("UwU"); // C is greater
        }

        System.out.println(sum);
        System.out.println(C.add(E));
        System.out.println(C.multiply(E));
        System.out.println(C.subtract(E));
        System.out.println(C.divide(E));
        System.out.println(C.remainder(E));


        System.out.println();
        System.out.println(Factorial.fact(100));
        System.out.println("\n");


        // BIG DECIMALS
        System.out.println("BIG DECIMALS: ");
        double x = 0.03;
        double y = 0.04;
        double ans = y-x;
        System.out.println(ans);

        BigDecimal X = new BigDecimal("0.03");
        BigDecimal Y = new BigDecimal("0.04");
        System.out.println(Y.subtract(X));

        System.out.println();
        BigDecimal P = new BigDecimal("23456.68732");
        BigDecimal Q = new BigDecimal("89242.89185");

        // operations
        System.out.println(P.add(Q));
        System.out.println(P.subtract(Q));
        System.out.println(P.multiply(Q));
    }
}
