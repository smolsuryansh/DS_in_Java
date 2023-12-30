package linersearch_kunal;

public class linearsearch {

    static int linearsearchfunc (int[] arr, int target) {
        // if the array is empty return -1
        if(arr.length == 0) {
            return -1;
        }

        // interate through the array
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target) {
                System.out.println("Element " + element + " found at index: " );
                return i;
            }
        }
        // if the element is not in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int ans = linearsearchfunc(nums, target);

        System.out.println(ans);
    }
}
