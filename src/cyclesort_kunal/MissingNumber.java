package cyclesort_kunal;

public class MissingNumber {
    // Leetcode: 268
    static int missingNumber(int[] arr){
        int pos = 0;
        while(pos < arr.length){
            int correctIndex = arr[pos]; // because we sort from 0 to n, not 1 to n
            if(arr[pos] < arr.length && arr[pos] != arr[correctIndex]){
                swap(arr, pos, correctIndex);
            }
            else {
                pos++;
            }
        }
        
        // search for missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){ // [0,1,2,4], 4 is at 3rd index, therefor 3 is missing
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,4};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
}
