package cyclesort_kunal;

public class FindDuplicateNumber {
    // Leetcode: 287
    static int findDuplicate(int[] nums){
        int pos = 0;
        while(pos < nums.length){
            if(nums[pos] != pos + 1){
                int correctIndex = nums[pos] - 1;
                if(nums[pos] != nums[correctIndex]){
                    swap(nums, pos, correctIndex);
                }
                else {
                    return nums[pos];
                }
            }
            else {
                pos++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }
}
