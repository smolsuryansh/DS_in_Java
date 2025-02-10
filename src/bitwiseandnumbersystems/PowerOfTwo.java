package bitwiseandnumbersystems;

public class PowerOfTwo {

    static boolean powerOfTwo(int num) {
        if (num == 0) {
            return false;
        }

        int count = 0;

        while (num > 0) {
            count += (num & 1);
            num = num >> 1;
        }

        return count <= 1;
    }

    static boolean easierApproach(int num) {
        if (num == 0) {
            return false;
        }

        return (num & (num - 1)) == 0; // 0 is an exception
    }

    public static void main(String[] args) {
        int num = 16;
        System.out.println(powerOfTwo(num));
        System.out.println(easierApproach(num));
    }
}
