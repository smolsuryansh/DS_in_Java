package assignment_questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Annagram {

    // neetcode 2, leetcode 242
    public boolean isAnnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }

        return countS.equals(countT);
    }

    // unoptimized approach
    public boolean isAnnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sortedS = s.toCharArray();
        char[] sortedT = t.toCharArray();

        Arrays.sort(sortedS);
        Arrays.sort(sortedT);

        return Arrays.equals(sortedS, sortedT);
    }
}
