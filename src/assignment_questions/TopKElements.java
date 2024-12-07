package assignment_questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKElements {

    // neetcode 5, leetcode 347
    public int[] topKFrequency(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            // add values to map, add +1 to values if duplicate exists
            count.put(num, count.getOrDefault(num, 0) + 1); // [1 -> 3], [2 -> 2], [3 -> 1]
        }

        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]); // descending order

        // add results for k elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr.get(i)[1];
        }
        return result;
    }
}
