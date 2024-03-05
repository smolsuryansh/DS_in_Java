package bitwiseandnumbersystems;

// Leetcode 1750, Minimum length of string after deleting similar ends
public class MinimumLenOfString {
    public static void main(String[] args) {
        String s = "aabccabba";
        int ans = minimumLength(s);
        System.out.println(ans);
    }

    static int minimumLength(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end && s.charAt(start) == s.charAt(end)) {
            char currentChar = s.charAt(start); // storing element to check if there are more similar elements like "aa"

            while (start <= end && s.charAt(start) == currentChar) {
                start++;
            }

            while (start <= end && s.charAt(end) == currentChar) {
                end--;
            }
        }
        return end - start + 1;
    }
}
