package recursionstring_kunal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// Time Complexity : O(n * 2^n), n is total number of elements and 2^n total number of subsets
// Space Complexity: O(2^n * n), 2^n is total subsets and n is space taken by each subset
public class DuplicateSubsequences {
    static List<List<Integer>> subSetDuplicate (int[] arr) {
        Arrays.sort(arr); // sort the array so that duplicates are together

        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(new ArrayList<>());

        int start = 0;
        int end = 0; // change when duplicate found

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current and precious element is same, s = e + 1
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outerList.size() - 1; //basically outer array length - 1

            int n = outerList.size();
            for (int j = start; j < n; j++) {
                List<Integer> interList = new ArrayList<>(outerList.get(j));
                interList.add(arr[i]);
                outerList.add(interList);
            }
        }
        return outerList;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subSetDuplicate(arr);
        System.out.println(ans);
    }
}
