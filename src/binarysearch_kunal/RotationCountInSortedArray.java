package binarysearch_kunal;

public class RotationCountInSortedArray {
    // Find how many times the array is rotated
    static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(mid < end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return end; // or return start
    }

    // if there are duplicates in pivot
    static int pivotDuplicates(int[] arr){
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
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end] > arr[end - 1]){
                    return end;
                }
                end--;
            }
            else if (arr[mid] > arr[start] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return end; // or start
    }

    static int findRotationCountDuplicates(int[] arr){
        int pivot = pivotDuplicates(arr);
        return pivot + 1;
    }

    static int findRotationCount(int[] arr){
        int pivot = pivot(arr);
        return pivot + 1;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int ans = findRotationCount(arr);
        System.out.println("Rotation count: " + ans);

        int[] arr1 = {3,3,4,5,5,1,2,2};
        int ans1 = findRotationCountDuplicates(arr1);
        System.out.println("Rotation count: " + ans1);
    }
}
