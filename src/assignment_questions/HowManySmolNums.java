package assignment_questions;

public class HowManySmolNums {
    // Leetcode 1365
    static int[] smallerNumThanCurrent(int[] nums){
        int count = 0;
        int size = nums.length;
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i != j){
                    if(nums[i] > nums[j]){
                        count++;
                    }
                }
            }
            result[i] = count;
            count = 0; // reset the value of count for other elements in array
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
