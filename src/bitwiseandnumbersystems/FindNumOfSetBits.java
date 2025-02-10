package bitwiseandnumbersystems;

public class FindNumOfSetBits {

    // find 1's in the number
    static int countApproach(int num) {
        if (num == 0) {
            return 0;
        }

        int count = 0;

        while (num > 0) {
            if ((num & 1) == 1) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    // easier? approach
    static int easierApproach(int num) {
        if (num == 0) {
            return 0;
        }

        int count = 0;

        while (num > 0) {
            count++;
            num -= (num & -num);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countApproach(45));
        System.out.println(Integer.toBinaryString(45));
    }
}
