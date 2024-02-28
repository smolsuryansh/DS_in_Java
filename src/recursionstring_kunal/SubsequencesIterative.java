package recursionstring_kunal;

import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(n * 2^n), n is total number of elements and 2^n total number of subsets
// Space Complexity: O(2^n * n), 2^n is total subsets and n is space taken by each subset
public class SubsequencesIterative {
    static List<List<Integer>> subSet (int[] arr) {
        List<List<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>()); // added new empty list inside the outer list

        for (int num : arr) {
            int n = outerList.size(); // n means size here

            // create internal lists the size of outer list
            for (int i = 0; i < n; i++) {
                List<Integer> internalList = new ArrayList<>(outerList.get(i)); // internal will be a copy of outerList(i) element

                internalList.add(num); // add current number that u are at to the internal list
                outerList.add(internalList); // add the answer that u got

            }
        }

        return outerList;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subSet(arr);

        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}
