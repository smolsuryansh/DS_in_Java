package assignment_questions;

public class RemoveConsecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        char prev = '\0';

        for (char c : str.toCharArray()) {
            if (c != prev) {
                sb.append(c);
                prev = c;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aabbccaa";
        System.out.println(removeConsecutiveDuplicates(str));
    }
}
