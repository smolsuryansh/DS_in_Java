package assignment_questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    // Leetcode 888
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes){
        int sumA = 0;
        int sumB = 0;
        Set<Integer> set = new HashSet<>();

        for (int a: aliceSizes){
            sumA += a;
        }

        for (int b: bobSizes){
            sumB += b;
            set.add(b);
        }

        int diff = (sumB - sumA) / 2;

        for(int a: aliceSizes){
            if(set.contains(a+diff)){
                return new int[]{a, a+diff};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] alice = {1,1};
        int[] bob = {2,2};
        int[] ans = fairCandySwap(alice, bob);
        System.out.println(Arrays.toString(ans));
    }
}
