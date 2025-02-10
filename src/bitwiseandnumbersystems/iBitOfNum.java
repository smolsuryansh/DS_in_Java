package bitwiseandnumbersystems;

public class iBitOfNum {
    // Find ith bit of a number
    // We use concept of Bit Masking
    static int iBit(int num, int n) {
        return (num & (1 << (n - 1))); // for some reason this returns the value of 1
    }

    static int setIBit(int num, int n) {
        return (num | (1 << (n - 1)));
    }

    static int resetIBit(int num, int n) {
        // do the complement for resetting
        return (num & (~(1 << (n - 1))));
    }

    // finding right most bit, ie first occurring 1 in binary digits
    static int rightMostBit(int num) {
        int position = 1;
        while((num & 1) == 0) {
            num >>= 1;
            position++;
        }
        return position;
    }

    public static void main(String[] args) {
        int num = 13; // 1 1 0 1
        int pos = 3;

        int ans = iBit(num, pos);
        int aaaaa = setIBit(num, 2);
        int bb = resetIBit(86, 5);
        int rr = rightMostBit(12);

        System.out.println(ans);
        System.out.println(aaaaa);
        System.out.println(bb);
        System.out.println(rr);

        System.out.println(Integer.toBinaryString(num));
    }
}
