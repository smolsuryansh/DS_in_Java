package binarysearch_kunal;

public class SearchInRotatedSortedArray {

    // We find pivot in the rotated array to solve this.
    // Pivot is the biggest element in the array.
    // This does not work if there are duplicate elements in the array
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            // 4 cases to find pivot
            if (mid < end && arr[mid] > arr[mid + 1]){ // to ensure that mid + 1 isnt out of bounds
                return mid; // means middle element is bigger than the next element
            }
            if (mid > start && arr[mid] < arr[mid - 1]){ // to ensure that mid - 1 isnt -1 itself
                return mid - 1; // means previous element is bigger than mid
            }
            if (arr[mid] <= arr[start]){ // because if the starting elements are bigger than mid
                end = mid - 1; // we will assign end as middle as there cant be bigger elements on the right, its a rotated array
            }
            else { // arr[mid] <= arr[end]
                start = mid + 1; // because the elements after mid are bigger so we will start from mid
            }
        }
        return end; // or return start since both are equal
    }

    // since both sides are ascending, we dont need to make order agnostic binary search
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // now searching in rotated array
    static int searchInRotatedArray(int[] arr, int target){
        int pivot = pivot(arr);
        int leftSide = binarySearch(arr, target, 0,  pivot);
        if(leftSide != -1){
            return leftSide;
        }
        return binarySearch(arr, target, pivot+1, arr.length - 1);
    }


    public static void main(String[] args) {
        int[] arr = {5,1,2,3};
        int ans = pivot(arr);

        System.out.println(ans);
    }
}
