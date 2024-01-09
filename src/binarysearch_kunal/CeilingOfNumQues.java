package binarysearch_kunal;

public class CeilingOfNumQues {

    // Smallest number that is greater or equal to target number
    static int Ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        // if target is bigger than last number of array:
        if(target > arr[end]) {
            return -1;
        }

        while(start <= end) {
            // Assign middle element:
            int mid = start + (end - start) / 2;

            // check is array is sorted in ascending or descending
            boolean isAsc = arr[start] < arr[end];

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(arr[mid] > target) {
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else {
                if(arr[mid] > target) {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 20;
        int ans = Ceiling(arr, target);

        System.out.println("Found at index: " + ans);
    }
}
