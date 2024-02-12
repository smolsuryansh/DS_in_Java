package recursion_arrays_kunal;

public class CheckSorted {
    static boolean checkSorted(int[] arr, int index){
        // base condition
        if (index == arr.length - 1){
            return true;
        }

        // arr[index + 1] wont go out of bond cause it is returning before that from base condition
        return arr[index] < arr[index + 1] && checkSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,6,4,5,6};
        System.out.println(checkSorted(arr, 0));
    }
}
