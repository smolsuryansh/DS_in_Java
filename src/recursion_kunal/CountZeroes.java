package recursion_kunal;

public class CountZeroes {
    static int helper(int num, int count){
        if(num == 0){
            return count;
        }
        int rem = num % 10;
        if(rem == 0){ // 10203
            return helper(num/10, count+1); //count++
        }
        return helper(num/10, count);
    }

    static int countZeroes(int num){
        return helper(num, 0);
    }

    public static void main(String[] args) {
        int num = 10204;
        int ans = countZeroes(num);
        System.out.println(ans);
    }
}
