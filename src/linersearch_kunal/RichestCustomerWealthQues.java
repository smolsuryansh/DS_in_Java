package linersearch_kunal;

import java.util.Arrays;

// LEETCODE question number 1672.
public class RichestCustomerWealthQues {
    static public int maximumWealth(int[][] accounts){
        // person = rows
        // account = cols
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }
            if(sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] accounts = {
                {1,2,3},
                {5,4,5},
                {7,5,3}
        };
        int result = maximumWealth(accounts);
        System.out.println(result);
    }
}
