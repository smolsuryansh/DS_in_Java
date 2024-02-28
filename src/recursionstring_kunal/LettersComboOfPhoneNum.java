package recursionstring_kunal;

import java.util.ArrayList;
import java.util.List;

public class LettersComboOfPhoneNum {
    // Leetcode 17
    public static void main(String[] args) {
//        phoneCombinations("", "12");
//        System.out.println(phoneCombinationsList("", "12"));
    }

    static ArrayList<String> phoneCombinationsList (String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char)('a' + i);

            list.addAll(phoneCombinationsList (p + ch, up.substring(1)));
        }
        return list;
    }

    static void phoneCombinations (String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; // this will convert b - 1 into a

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch  = (char)('a' + i);

            phoneCombinations(p + ch, up.substring(1));
        }
    }

    // Leetcode solution
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

    private static void solve(String digits, StringBuilder output, int index, List<String> ans, String[] map) {
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
