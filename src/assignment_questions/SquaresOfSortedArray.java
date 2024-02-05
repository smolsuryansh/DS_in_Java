package assignment_questions;

import java.util.Arrays;

public class SquaresOfSortedArray {
    // This is a brute force approach, leetcode: 997

    static int[] squaresOfArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= arr[i];
        }

        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2};
        int[] ans = squaresOfArray(arr);
        System.out.println(Arrays.toString(ans));
    }
}
