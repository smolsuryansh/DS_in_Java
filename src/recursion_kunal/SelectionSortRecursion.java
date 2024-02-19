package recursion_kunal;

import java.util.Arrays;

public class SelectionSortRecursion {
    static void selectionSort (int[] arr, int row, int col, int max) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            if (arr[col] > arr[max]) { // taking max as an index
                selectionSort(arr, row, col + 1, col);
            } else {
                selectionSort(arr, row, col + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            selectionSort(arr, row - 1,0, 0); // assume 0 is the max element
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,8,1};
        selectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
}
