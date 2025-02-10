package bitwiseandnumbersystems;

public class CalculateApowerB {

    static int calculatePower(int num, int power){
        if (num == 0) {
            return 0;
        }

        int ans = 1;
        int base = num;

        while (power > 0) {
            if ((power & 1) == 1) {
                ans = ans * base;
            }
            base = base * base;
            power = power >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(calculatePower(3, 6));
    }
}
