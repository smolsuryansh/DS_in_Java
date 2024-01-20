package insertionsort_kunal;

import java.util.Arrays;

public class InsertionSort {
    // Time complexity: Worst case: O(n^2), Best case: O(n)
    static void insertionSort(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else {
                    break; // when element j is NOT smaller than j-1, then break
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {40,30,10,20,50};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
