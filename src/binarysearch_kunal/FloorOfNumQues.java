package binarysearch_kunal;

public class FloorOfNumQues {

    // Greatest number smaller than or equal to target number.
    static int Floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        // if number is smaller than the first number of the array it will return -1 by default.

        while(start <= end) {
            int mid =  start + (end - start) / 2;

            boolean isAsc = arr[start] < arr[end];

            // To check Floor:
            if(arr[mid] <= target) {
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else {
                if(target < arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return end;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9};
        int target = 8;
        int ans = Floor(arr, target);
        System.out.println("Element found at index: " + ans);
    }
}
