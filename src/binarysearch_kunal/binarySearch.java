package binarysearch_kunal;

// Best case for binary search: O(1)
// Worse case for binary searchL O(logN)

public class binarySearch {
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // this might exceed integer limit in java
//            int mid = (start + end) / 2;

            //better way:
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // ans found
            }
        }
        // otherwise nothing found
        return -1;
    }

    static int binarysearchDesc(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // this might exceed integer limit in java
//            int mid = (start + end) / 2;

            //better way:
            int mid = start + (end - start) / 2;

            if(target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                return mid; // ans found
            }
        }
        // otherwise nothing found
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,17,18,19,20,42,64,85,97,100};
        int target = 6;

        int ans = binarysearch(arr, target);
        System.out.println("You target element found at index: " + ans);

        int[] arrDesc = {9,8,5,3,2,1};
        int targetDesc = 2;

        int ansDesc = binarysearchDesc(arrDesc, targetDesc);
        System.out.println("You target element found at index: " + ansDesc);
    }
}
