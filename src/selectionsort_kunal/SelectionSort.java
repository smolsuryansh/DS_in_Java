package selectionsort_kunal;

import java.util.Arrays;

public class SelectionSort {
    // Time complexity: O(n^2)
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // Find the max item in the remaining array and swap with correct index
            int end = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, end);

            swap(arr, maxIndex, end);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4,6,5,3,1,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
