package recursionstring_kunal;

public class Subsequences {
    // Subsets are for Arrays, Subsequences are for Strings
    static void subSeq (String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0); // first element from the String

        subSeq(p + ch, up.substring(1)); // adding recursion
        subSeq(p, up.substring(1)); // ignoring recursion
    }

    public static void main(String[] args) {
        subSeq("", "abc");
    }
}
