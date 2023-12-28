package arrays_kunal;

public class MaxofArrayQues {


     static int max(int[] arr){
         // if array not empty
         int maxVal = 0;
         for (int i = 0; i < arr.length; i++) {
             if(arr[i] > maxVal){
                 maxVal = arr[i];
             }
         }
         return maxVal;
     }

    static int maxRange(int[] arr, int start, int end){
        // if array not empty
        int maxVal = start;
        for (int i = start; i <= end; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 6, 15};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 2, 4));
    }
}
