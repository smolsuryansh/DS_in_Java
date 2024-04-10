package arrays_kunal;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int[] newAns = insert(arr, 5, 5, 4);
        System.out.println(Arrays.toString(newAns));
    }

    public static int[] insert (int[] arr, int sizeOfOldArr, int val, int index) {
        int[] newArr = new int[sizeOfOldArr + 1];

        for (int i = 0; i < sizeOfOldArr + 1; i++) {
            if (1 < index - 1) {
                newArr[i] = arr[i];
            } else if (i == index - 1) {
                newArr[i] = val;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }
}
