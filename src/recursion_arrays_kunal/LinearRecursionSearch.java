package recursion_arrays_kunal;

public class LinearRecursionSearch {
    static boolean booleanLinearSearch(int[] arr, int target, int index){
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || booleanLinearSearch(arr, target, index + 1);
    }

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

    public static void main(String[] args) {

    }
}
