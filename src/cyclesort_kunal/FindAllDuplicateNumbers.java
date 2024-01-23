package cyclesort_kunal;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateNumbers {
    // Leetcode: 442
    static List<Integer> findDuplicates(int[] nums) {
        int pos = 0;
        while(pos < nums.length){
            int correctIndex = nums[pos] - 1;
            if(nums[pos] != nums[correctIndex]){
                swap(nums, pos, correctIndex);
            }
            else{
                pos++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {

    }
}
