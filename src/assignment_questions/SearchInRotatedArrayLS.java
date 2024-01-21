package assignment_questions;

public class SearchInRotatedArrayLS {
    static int linerSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,0,1,2,3};
        int target = 5;
        int ans = linerSearch(arr, target);
        System.out.println(ans);
    }
}
