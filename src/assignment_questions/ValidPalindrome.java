package assignment_questions;

public class ValidPalindrome {

    // neetcode-10/leetcode-125
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && !isAlphaNum(s.charAt(start))) {
                start++;
            }
            while (start < end && !isAlphaNum(s.charAt(end))) {
                end--;
            }

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public static boolean isAlphaNum(char c) {
        return (
            c >= 'A' && c <= 'Z' ||
            c >= 'a' && c <= 'z' ||
            c >= '0' && c <= '9'
        );
    }

    public static void main(String[] args) {
        String s = "Was it a car or a cat i saw?";
        String t = "tab a cat";

        System.out.println(s + " = " + isPalindrome(s));
        System.out.println(t + " = " + isPalindrome(t));
    }
}
