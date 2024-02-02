package bitwiseandnumbersystems;

public class iBitOfNum {
    // Find ith bit of a number
    // We use concept of Bit Masking
    static int iBit(int num, int i) {
        return (num & (1 << (i - 1))); // for some reason this returns the value of 1
    }

    public static void main(String[] args) {
        int num = 13; // 1 1 0 1
        int pos = 3;

        int ans = iBit(num, pos);

        System.out.println(ans);
    }
}
