package arrays_kunal;

import java.util.Arrays;

public class ReverseArray {
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        // Two pointer approach
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
