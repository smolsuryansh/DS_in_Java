package assignment_questions;

public class NumberComplement {
    public static int findComplement(int num) {
        int copy = num;
        int mask = 0;

        while (copy != 0) {
            if (mask != 0) {
                mask <<= 1;
            }

            mask += 1;
            copy >>= 1;
        }

        return mask ^ num;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(findComplement(num)); // 5 = 101, complement of 5: 010 = 2
    }
}
