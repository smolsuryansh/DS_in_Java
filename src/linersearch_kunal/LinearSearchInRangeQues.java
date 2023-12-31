package linersearch_kunal;

public class LinearSearchInRangeQues {
    static int linearSearchInRange (int[] arr, int target, int start, int end) {
        // if the array is empty return -1
        if(arr.length == 0) {
            return -1;
        }

        // iterate through the array
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if(element == target) {
                System.out.println("At index " + i + " the element is found: ");
                return element;
            }
        }
        // if the element is not in the array
        return Integer.MAX_VALUE; // cause the element can also be a -1 but index can never be -1.
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int ans = linearSearchInRange(arr, target, 2, 7);

        System.out.println(ans);
    }
}
