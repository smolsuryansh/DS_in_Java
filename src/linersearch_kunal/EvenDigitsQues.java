package linersearch_kunal;

// Find total number of numbers that are EVEN: like 18 has 2 digits, even digits, 1777 has even digits, etc
public class EvenDigitsQues {

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums){
            if(even(num)){
                count++;
            }
        }

        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);

        if(numberOfDigits % 2 == 0) {
            return true;
        }

        return false;
    }

    static int digits(int num) { // can use debugger to undestand
        // If the number is negative
        if(num < 0){
            num = num * -1; // multiplying it with a minus would result in a plus
        }

        // If the number is 0
        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {12, 8, 1786, 344};
        System.out.println(findNumbers(arr));
        System.out.println(digits(-2312321));
    }
}
