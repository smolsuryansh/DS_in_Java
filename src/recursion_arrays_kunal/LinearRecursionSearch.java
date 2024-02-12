package recursion_arrays_kunal;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LinearRecursionSearch {

    // Linear search in boolean
    static boolean booleanLinearSearch(int[] arr, int target, int index){
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || booleanLinearSearch(arr, target, index + 1);
    }

    // Linear search in ascending order
    static int linearSearch(int[] arr, int target, int index){
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else {
            return linearSearch(arr, target, index + 1);
        }
    }

    // Linear search in descending order
    static int linearSearchDesc(int[] arr, int target, int index){
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        else {
            return linearSearchDesc(arr, target, index - 1);
        }
    }

    // Find indexes of duplicate values as well
    static ArrayList<Integer> list = new ArrayList<>();
    static void linearSearchAllIndex(int[] arr, int target, int index){
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        linearSearchAllIndex(arr, target, index + 1);
    }

    // Alternative: Find indexes of duplicates as well
    static ArrayList<Integer> linearSearchAllIndexList(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length) {
            return list; // when the end is reached, return the list itself.
        }
        if (arr[index] == target){
            list.add(index);
        }
        return linearSearchAllIndexList(arr, target, index + 1, list);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,6,7,8,9};
        int target = 3;

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> ans = linearSearchAllIndexList(arr, target, 0, list1);
        System.out.println(ans);

//        linearSearchAllIndex(arr, target, 0);
//        System.out.println(list);
    }
}
