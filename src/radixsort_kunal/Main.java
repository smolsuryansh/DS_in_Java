package radixsort_kunal;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {29, 83, 471, 36, 91, 8};
        System.out.println("Original array: " + Arrays.toString(arr));
        RadixSort.radixSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
