package countsort_kunal;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {3,4,1,3,2,5,2,8};
        int[] arr1 = {6,7,2,5,6,1,2,3};
        CountSort.countSort(arr);
        System.out.println(Arrays.toString(arr));

        CountSortUsingHash.countSortUsingHash(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
