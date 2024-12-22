package assignment_questions;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {

    // neetcode 6
    public static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public static List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            res.add(str.substring(i, j));
            i = j;
        }

        return res;
    }

    public static void main(String[] args) {
        List<String> strs = List.of("neet","code","love","you");
    }

}
