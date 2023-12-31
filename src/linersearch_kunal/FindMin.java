package linersearch_kunal;

public class FindMin {

    static int min(int[] arr) {
        // Check if array is empty
        if(arr.length == 0){
            return -1;
        }

        // If not empty
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,6,2,1,7,8};
        int result = min(arr);

        System.out.println(result);
    }
}
