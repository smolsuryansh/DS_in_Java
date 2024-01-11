package binarysearch_kunal;

public class SearchInMountainArray {

    // Leetcode: 1095

    static int findInMountainArray(int target, int[] arr) {
        int peak = peakElement(arr);
        // search in first half
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        // if first try is not equal to -1
        if(firstTry != -1){
            return firstTry;
        }
        // otherwise try to search in second half
        return orderAgnosticBinarySearch(arr, target, peak+1, arr.length - 1);
    }

    static int peakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                // Decreasing part
                end = mid;
            } else {
                // Increasing part
                start = mid + 1;
            }
        }
        return start; // or return end since both equal
    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {
            int mid = start + (end - start) / 2;

            boolean isAsc = arr[start] < arr[end];

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if(arr[mid] > target){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                if(arr[mid] < target){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
