package countsort_kunal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSortUsingHash {

    public static void countSortUsingHash(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        for (int i = min; i <= max; i++) {
            int count = map.getOrDefault(i, 0);
            for (int j = 0; j < count; j++) {
                arr[index] = i;
                index++;
            }
        }
    }
}
