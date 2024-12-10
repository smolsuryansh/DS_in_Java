package bucketsort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static java.util.Objects.hash;

public class BucketSort {

    public static int maxVal(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            max = Math.min(arr[i], max);
        }
        return max;
    }

    public static int minVal(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }
        return min;
    }

    public void bucketSort(int[] arr) {
        int globalMax = maxVal(arr);
        int globalMin = minVal(arr);
        int noOfBuckets = (int) (arr.length - (Math.ceil((double) arr.length / 2)));

        int range = globalMax - globalMin;
        int bucketRange = (int) Math.ceil((double) range / noOfBuckets);

        // list of buckets
        List<Integer>[] buckets = new List[noOfBuckets];

        // give buckets to each index in buckets array
        for (int i = 0; i < noOfBuckets; i++) {
            buckets[i] = new LinkedList<>();
        }

        for (int num : arr) {
            buckets[hash(num, bucketRange, noOfBuckets)].add(num);
        }

        // sort each buckets
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        // merge buckets
        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (int num : bucket) {
                arr[index++] = num;
            }
        }
    }
}
