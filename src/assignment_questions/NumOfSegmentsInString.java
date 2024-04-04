package assignment_questions;

public class NumOfSegmentsInString {
    // Leetcode 434
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));
    }

    static int countSegments (String s) {
        // keep track of the segments
        int segments = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((i == s.length() - 1 || s.charAt(i + 1) == ' ') && s.charAt(i) != ' ') {
                segments++;
            }
        }
        return segments;
    }
}
