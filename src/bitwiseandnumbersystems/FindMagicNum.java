package bitwiseandnumbersystems;

public class FindMagicNum {
    // Find the nth magic number
    //     5^3 5^2 5^1 -> base
    // 1 =  0   0   1  -> 5
    // 2 =  0   1   0  -> 25
    // 3 =  0   1   1  -> 30
    public static void main(String[] args) {
        int n = 6; // find 6th magix num

        int ans = 0;
        int base = 5;

        while(n > 0){
            int last = n & 1; // the finds the last num in binary
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }

        System.out.println(ans);
    }
}
