package bitwiseandnumbersystems;

public class FindOnceOccurringInThreeDups {

    // this time there are 3 duplicates
    static int bitwiseApproach(int[] nums) {
        int specialNum = 0; // this will store single occurring number

        for (int i = 0; i < 32; i++) {
            int sum = 0; // sum of bits at position i

            for(int num : nums) {
                sum += (num >> i) & 1; // "num >> i", shift to i and then "& 1" extracts right most value
            }
            sum %= 3;

            specialNum |= (sum << i);
        }

        return specialNum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2, 7, 7, 8, 7, 8, 8};


    }
}
