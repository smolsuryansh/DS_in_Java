package binarysearch_kunal;

public class PosOfElementInInfiniteArray {

    // Find the position of element in the infinite sorter array, cannot use arr.length
    // we will keep doubling the size of start and end
    static int posInfiniteArray (int[] arr, int target, int start, int end){

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findRange(int[] arr, int target){
        // starting with box size of 2
        int start = 0;
        int end = 1;

        while(target > arr[end]){

            int newStart = end + 1;  // assigning start early cause we use old start in the formula below, basically temp
            //double the box value, end = previous end + size of box * 2
            end = end + (end - start + 1) * 2; // here we use the old start
            start = newStart;

        }
        return posInfiniteArray(arr, target, start, end);
    }

    public static void main(String[] args) {
        // There will be an error (Out of bounds exception) in this as this is an finite array and not an infinite array.
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18,19,20,21,22,25,26};
        int target = 25;
        int ans = findRange(arr, target);
        System.out.println(ans);
    }
}
