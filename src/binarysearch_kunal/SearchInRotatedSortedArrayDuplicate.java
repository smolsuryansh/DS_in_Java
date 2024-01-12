package binarysearch_kunal;

public class SearchInRotatedSortedArrayDuplicate {

    static int pivotDuplicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            // if elements at start, end and middle are same, skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicates
                // What is the duplicates has the pivot?
                // Check whether the start is the pivot
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                // Check whether the end is the pivot
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, now pivot should be in right.
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end; // or return start
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > target) {
                end = mid - 1;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
