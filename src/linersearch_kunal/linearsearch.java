package linersearch_kunal;

// Best case for linear search: O(1)
// Worse case for linear search: O(N)

public class linearsearch {

    // Search the target and return element
    static int linearsearchfuncElements (int[] arr, int target) {
        // if the array is empty return -1
        if(arr.length == 0) {
            return -1;
        }

        // interate through the array
        for (int element : arr) {
            if (element == target) {
                System.out.println("Element: ");
                return element;
            }
        }
        // if the element is not in the array
        return Integer.MAX_VALUE; // cause the element can also be a -1 but index can never be -1.
    }

    // Search the target and return index
    static int linearsearchfunc (int[] arr, int target) {
        // if the array is empty return -1
        if(arr.length == 0) {
            return -1;
        }

        // interate through the array
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target) {
                System.out.println("Element found at index: " );
                return i;
            }
        }
        // if the element is not in the array
        return -1;
    }

    // Search the target and return true or false
    static boolean linearsearchfuncBoolean (int[] arr, int target) {
        // if the array is empty return -1
        if(arr.length == 0) {
            return false;
        }

        // interate through the array
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target) {
                return true;
            }
        }
        // if the element is not in the array
        return false;
    }



    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        int ans = linearsearchfunc(nums, target);
//        int ans2 = linearsearchfuncElements(nums, target);
//        Boolean ans3 = linearsearchfuncBoolean (nums, target);
        System.out.println(ans);
//        System.out.println(ans2);
//        System.out.println(ans3);

    }
}
