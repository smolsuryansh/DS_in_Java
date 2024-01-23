package cyclesort_kunal;

public class SetMismatch {
    // Leetcode: 645
    static int[] findErrorNums(int[] nums) {
        int pos = 0;
        while(pos < nums.length){
            int correctIndex = nums[pos] - 1;
            if(nums[pos] != nums[correctIndex]){
                swap(nums, pos, correctIndex);
            }
            else {
                pos++;
            }
        }

        // searching
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index + 1){
                return new int[]{nums[index], index + 1};
            }
        }
        return new int[]{};
    }

    static void swap (int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {

    }
}
