package mathsfordsa_kunal;

import java.util.ArrayList;
import java.util.List;

public class Factors {

    // optimized
    public static List<Integer> factors(int num) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (num/i == i) {
                    list.add(i);
                } else {
                    list.add(i);
                    list2.add(num/i);
                }
            }
        }
        for (int i = list2.size() - 1; i >= 0; i--) {
            list.add(list2.get(i));
        }

        return list;
    }

    // unoptimized
    public static List<Integer> factorsEasy(int num) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int n = 36;
        System.out.println(factorsEasy(n));
        System.out.println(factors(n));
    }
}
