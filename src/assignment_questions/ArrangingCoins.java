package assignment_questions;

public class ArrangingCoins {
    static int arrangeCoins(int n){
        long start = 0;
        long end = n;

        while(start <= end){
            long mid = start + (end - start) / 2;
            long coinsFilled = mid * (mid + 1) / 2;

            if(coinsFilled == n){
                return (int) mid;
            }
            else if(coinsFilled > n){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return (int) start - 1;
    }

    static int bruteCoinsForce(int n){
        int i = 1; //initial
        int ans = n;

        while(n >= i){
            n -= i;
            ans++;
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
