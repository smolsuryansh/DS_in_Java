package binarysearch_kunal;

public class OrderAgnosticBS {
    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // Find whether array is sorted in ascending or descending
        while(start <= end){
            int mid = start + (end - start) / 2;

            boolean isAsc = arr[start] < arr[end];

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target > arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        int target = 6;
        int ans = orderAgnosticBinarySearch(arr, target);

        System.out.println("Your element is in index: " + ans);
    }
}
