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

            if(target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = Ceiling(arr, target);

        System.out.println("Found at index: " + ans);
    }
}
