package binarysearch_kunal;

public class SplitArrayLargestSum {

    // LeetCode: 410
    static int splitArray(int[] nums, int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // find max from nums
            end += nums[i]; // end = end + nums[i], basically adding sum of all nums in end
        }

        while (start < end){
            // try middle as the potential answer
            int mid = start + (end - start) / 2;

            // Calculate how many pieces u can divide this in with max sum
            int sum = 0;
            int pieces = 1;

            for (int num : nums){
                if (sum + num > mid){
                    // Means you cannot add more in this subarray
                    // You add this num in new subarray, then sum = num
                    sum = num;
                    pieces++;
                }
                else {
                    sum += num; // Keep adding in this subarray
                }
            }
            if (pieces > m){
                start = mid + 1;
            }
            else {
                end = mid; // pieces <= m
            }
        }
        return end; // or start since start == end
    }

    public static void main(String[] args) {

    }
}
