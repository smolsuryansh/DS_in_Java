package mergesort_kunal;

import java.util.Arrays;

public class MergeSortInPlace {
    // Merge sort without creating copy of the array, changing in the original array
    static void mergeSort (int[] arr, int start, int end){
        if (end - start == 1) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        mergeArray(arr, start, mid, end);

        // not returning anything cause we are changing the original array
    }


    static void mergeArray(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) { // i is start its going til MID, j is mid its going til END
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        // modifying original array
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,2,3,1};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
