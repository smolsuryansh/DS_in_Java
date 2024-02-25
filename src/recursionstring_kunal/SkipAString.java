package recursionstring_kunal;

public class SkipAString {
    static String skipApple (String original) {
        if (original.isEmpty()) {
            return "";
        }

        if (original.startsWith("apple")) {
            return skipApple(original.substring(5)); // skip 5 letters hence substring(5)
        } else {
            return original.charAt(0) + skipApple(original.substring(1)); // add
        }
    }

    public static void main(String[] args) {
        System.out.println(skipApple("bcappledah"));
    }
}
