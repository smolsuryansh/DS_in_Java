package assignment_questions;

public class Sqrt {
    // Leetcode ques: 69, use binary search

    // Return square root of the num provided
    static int sqrt(int num){
        if(num < 0){
            return -1;
        }

        int start = 1;
        int end = num;
        int count = 0;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid <= num/mid){
                count = mid;
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(sqrt(num));
    }
}
