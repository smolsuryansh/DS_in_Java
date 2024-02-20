package mergesort_kunal;

import java.util.Arrays;

public class MergeSortRecursion {
    // Time Complexity: O(N * logN)
    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)); // creates a copy of original array
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeArrays(left, right);
    }

    static int[] mergeArrays(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0; // pointing to arr 1, left
        int j = 0; // pointing to arr 2, right
        int k = 0; // pointer for new array

        while (i < first.length && j < second.length) { // should be inside the array bound
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++; // move ahead in the new array as well with each element being added
        }
        // It may be possible that one of the array may not be complete
        // copy the remaining elements to the end
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,2,3,1};
        arr = mergeSort(arr); // this way you can update the original array
        System.out.println(Arrays.toString(arr));
    }
}
