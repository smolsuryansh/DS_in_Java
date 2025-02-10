package mathsfordsa_kunal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsPrime {

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) { // c * c <= n is same as c <= sqrt(n)
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

    static void allPrimeNumInRange(int num, boolean[] primes) {
        for (int i = 2; i * i <= num; i++) { // same as sqrt(num)
            if (!primes[i]) {
                for (int j = i * 2; j <= num; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= num; i++) {
            if (!primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 40;
//        for (int i = 1; i <= n; i++) {
//            if (isPrime(i)) {
//                System.out.println(i); // all prime numbers til n
//            }
//        }

        boolean[] primes = new boolean[n + 1];
        allPrimeNumInRange(n, primes);
    }
}
