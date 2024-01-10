package binarysearch_kunal;

public class PeakIndexInMountainArray {

    // Leetcode: 852. Mountain array is also known bitonic array.
    static int peakIndexMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end) { // no <= because it has two sorted arrays
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                // Decreasing part of array
                // This can be the answer, which is why end != mid -1.
                end = mid;
            } else {
                // Otherwise in increasing part of array
                // Since we know mid + 1 element > mid element, it is not mid element.
                start = mid + 1;
            }
        }
        // in the end start == end because of two pointer approach
        return start; // or return end since both are equal in the end.
    }



    static int bruteForcePeak(int[] arr){

        if(arr.length == 0){
            return -1;
        }

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        int ans = bruteForcePeak(arr);
        System.out.println(ans);
        int ans1 = peakIndexMountainArray(arr);
        System.out.println("Found at index using binary search: " + ans1);
    }
}
