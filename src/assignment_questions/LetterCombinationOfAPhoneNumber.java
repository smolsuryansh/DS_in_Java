package assignment_questions;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfAPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        List<String> ans = letterCombinations(digits);
        System.out.println(ans);
    }

    static List<String> letterCombinations (String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        StringBuilder output = new StringBuilder();
        int index = 0;
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        solve (digits, output, index, ans, map);
        return ans;
    }

    static private void solve(String digits, StringBuilder output, int index, List<String> ans, String[] map) {
        if (index >= digits.length()) {
            ans.add(output.toString());
            return;
        }

        int number = digits.charAt(index) - '0';
        String value = map[number];

        for (int i = 0; i < value.length(); i++) {
            output.append(value.charAt(i));
            solve(digits, output, index + 1, ans, map);
            output.deleteCharAt(output.length() - 1);
        }
    }
}
