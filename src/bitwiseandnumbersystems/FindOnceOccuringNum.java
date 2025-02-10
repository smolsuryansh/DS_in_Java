package bitwiseandnumbersystems;

import java.util.HashMap;
import java.util.Map;

public class FindOnceOccuringNum {
    // Find the number that occurs only once in an array
    static int bruteApproach(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = i + 1; j < arr.length; j++) {
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

    // hashmap
    static int hashApproach(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    // XOR all the elements, O(n)
    static int findUnique(int[] arr){
        int unique = 0;

        for(int num : arr){
            unique ^= num; // XOR the array, duplicates will lead to zero, a ^ a = 0
        }

        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,3,1,6,4,5,5,1,4};
        int ans = findUnique(arr);
        System.out.println(ans);
        System.out.println("Hash approach: " + hashApproach(arr));

//        int ans = bruteApproach(arr);
//        System.out.println(ans);

//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : arr) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        System.out.println(map);
    }
}
