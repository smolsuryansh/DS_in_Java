package bubblesort_kunal;

import java.util.Arrays;

public class BubbleSort {
    // Time complexity: O(n^2)

    static void bubbleSort(int[] arr){
        boolean swapped; // to check if the array is already sorted or not
        // Run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            // for each step, max item will come at the last respect index
            for (int j = 1; j < arr.length - i; j++) { // MUST HAVE j=1
                // Swap after comparing
                if(arr[j] < arr[j-1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // If there is no sorting for i (first loop), it means the array is already sorted
            if(!swapped){ // or swapped == false
                break;
            }
        }
    }


    public static void main(String[] args) {
        int[] nums = {1,3,2,6,4,5};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
