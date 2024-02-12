package recursion_kunal;

public class StepsToReduceToZero {
    // Leetcode: 1342
    static int helper(int num, int count) {
        if(num == 0){
            return count;
        }
        if (num % 2 == 0){
            return helper(num/2, count+1);
        }
        return helper(num - 1, count+1);
    }

    static int numberOfSteps(int num) {
       return helper(num, 0);
    }

    public static void main(String[] args) {
        int num = 14;
        int ans = numberOfSteps(num);

        System.out.println(ans);
    }
}
