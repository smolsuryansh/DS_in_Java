package cyclesort_kunal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllMissingNumbers {
    // Leetcode: 448
    static List<Integer> findDisappearedNumbers(int[] nums){
       int pos = 0;
       while (pos < nums.length){
           int correctindex = nums[pos] - 1;
           if(nums[pos] != nums[correctindex]){
               swap(nums, pos, correctindex);
           }
           else {
               pos++;
           }
       }

       // search for missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1){ // 5 is absent at 4th index, therefore return 4+1
                ans.add(index + 1); // 5 is absent at 4th index, therefore return 4+1
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
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
}
