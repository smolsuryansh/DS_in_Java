package recursionstring_kunal;

import java.util.ArrayList;

public class ASCIIValueOfCharacter {
    static void ascii (String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        ascii(p + ch, up.substring(1));
        ascii(p, up.substring(1));
        ascii(p + (ch + 0), up.substring(1)); // ch + o returns the ascii value
    }

    static ArrayList<String> asciiList (String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = asciiList(p + ch, up.substring(1));
        ArrayList<String> second = asciiList(p, up.substring(1));
        ArrayList<String> third = asciiList(p + (ch + 0), up.substring(1));


        first.addAll(second);
        first.addAll(third);
        return first;
    }

    public static void main(String[] args) {
//        ascii("", "abc");
        System.out.println(asciiList("", "abc"));
    }
}
