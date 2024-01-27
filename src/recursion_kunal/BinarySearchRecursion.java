package recursion_kunal;

public class BinarySearchRecursion {
    // Divide and conquer recursion relation
    static int binarySearch(int[] arr, int target, int start, int end){ // using start and end here for future functions use

        if(start > end){
            // ans not found
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(arr[mid] == target){
            return mid;
        }

        if(target < arr[mid]){
            return binarySearch(arr, target, start, mid - 1);
        }

        return binarySearch(arr, target, mid + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        int ans = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }
}
