package countsort_kunal;

public class CountSort {

    public static void countSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        int[] countArray = new int[max + 1];
        for (int num : arr) {
            countArray[num]++; // for each element add to index and increase count by 1 if duplicate exists
        }

        int index = 0;
        for (int i = 0; i <= max; i++) {
            while(countArray[i] > 0) {
                arr[index] = i;
                index++;
                countArray[i]--;
            }
        }
    }
}
