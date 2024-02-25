package recursionstring_kunal;

public class SkipAStringIfNotReqString {
    // Skip APP if APPLE is not found
    static String skipAppIfApple (String original) {
        if (original.isEmpty()) {
            return "";
        }

        if (original.startsWith("app") && !original.startsWith("apple")) {
            return skipAppIfApple(original.substring(3)); // skip app, substring(3)
        } else {
            return original.charAt(0) + skipAppIfApple(original.substring(1)); // add
        }
    }

    public static void main(String[] args) {
        System.out.println(skipAppIfApple("bacappldah"));
    }
}
