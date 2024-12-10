package assignment_questions;

public class HighestOccuringChar {

    public static char highestOccuringChar(String str) {
        if (str == "" || str.length() <= 1) {
            return str.charAt(0);
        }

        int[] freq = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        int maxCount = -1;
        char result = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch - 'a'] > maxCount) {
                maxCount = freq[ch - 'a'];
                result = ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "aabcdefgha";
        System.out.println(highestOccuringChar(str));
    }
}
