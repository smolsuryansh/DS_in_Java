package cyclesort_kunal;

import java.util.Arrays;

public class CycleSort {
    // Time Complexity: O(n)
    static void cycleSort(int[] arr){ // check, swap, move
        int i = 0; // initial position
        while(i < arr.length){
            int correctIndex = arr[i] - 1; // index = value - 1
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else {
                i++; // otherwise i will move ahead.
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
