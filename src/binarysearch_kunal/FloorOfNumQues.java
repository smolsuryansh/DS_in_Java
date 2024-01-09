package binarysearch_kunal;

public class FloorOfNumQues {

    // Greatest number smaller than or equal to target number.
    static int Floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        // if number is smaller than the first number of the array it will return -1 by default.

        while(start <= end) {
            // Assign middle element:
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return end;
    }


    public static void main(String[] args) {
        int[] arr = {2,4,5,7,9};
        int target = 1;
        int ans = Floor(arr, target);
        System.out.println("Element found at index: " + ans);
    }
}
