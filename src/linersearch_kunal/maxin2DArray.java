package linersearch_kunal;

public class maxin2DArray {

    static int max(int[][] arr){
        int max = arr[0][0];

        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if(max < arr[rows][cols]){
                    max = arr[rows][cols];
                }
            }
        }
        return max;
    }
    
    // 2nd loop
    static int max2(int[][] arr){
        int max = Integer.MIN_VALUE;

        for (int[] nums : arr) {
            for (int elements : nums) {
                if (max < elements) {
                    max = elements;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(max(arr));
        System.out.println(max2(arr));
    }
}
