package cyclesort_kunal;

public class FirstMissingPositive {
    // Leetcode 41
    static int firstMissingPositive(int[] nums){
        int pos = 0;
        while(pos < nums.length){
            int correctIndex = nums[pos] - 1;
            if(nums[pos] > 0 && nums[pos] < nums.length && nums[pos] != nums[correctIndex]){
                swap(nums, pos, correctIndex);
            }
            else {
                pos++;
            }
        }

        // search
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1){
                return index + 1;
            }
        }
        return nums.length + 1; // [1,2,3,4] so 5 is the first missing positive :D
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {

    }
}
