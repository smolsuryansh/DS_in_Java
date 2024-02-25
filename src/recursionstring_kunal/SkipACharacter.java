package recursionstring_kunal;

public class SkipACharacter {
    // Passing in argument
    static void skip (String pro, String unpro) { // processed, unprocessed
        if (unpro.isEmpty()) {
            System.out.println(pro);
            return;
        }

        char ch = unpro.charAt(0);

        if (ch == 'a') {
            skip (pro, unpro.substring(1)); //skip
        } else {
            skip (pro + ch, unpro.substring(1)); // add
        }
    }

    // Returing the String
    static String skip (String original) { // processed, unprocessed
        if (original.isEmpty()) {
            return "";
        }

        char ch = original.charAt(0);

        if (ch == 'a') {
            return skip(original.substring(1)); //skip
        } else {
            return ch + skip(original.substring(1)); // add
        }
    }

    public static void main(String[] args) {
        skip("", "baccad");
        System.out.println(skip("backchadi"));
    }
}
