package bitwiseandnumbersystems;

public class FindOnceOccuringNum {
    // Find the number that occurs only once in an array
    static int bruteApproach(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                return arr[i];
            }
        }
        return -1;
    }

    // XOR all the elements, O(n)
    static int findUnique(int[] arr){
        int unique = 0;

        for(int num : arr){
            unique ^= num;
        }

        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,3,1,4,5,1,4};
        int ans = findUnique(arr);
        System.out.println(ans);

//        int ans = bruteApproach(arr);
//        System.out.println(ans);
    }
}
