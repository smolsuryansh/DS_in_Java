package recursionstring_kunal;

import java.util.ArrayList;

public class ArrayListOfString {

    // Creating array list outside the function
    static void subSeq (String p, String up, ArrayList<String> list) {
        if (up.isEmpty()) {
            list.add(p);
            return;
        }

        char ch = up.charAt(0);

        subSeq(p + ch, up.substring(1), list);
        subSeq(p, up.substring(1), list);
    }

    static ArrayList<String> subSeqList (String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subSeqList(p + ch, up.substring(1)); // add on left
        ArrayList<String> right = subSeqList(p, up.substring(1)); // ignore on right

        left.addAll(right); // adding both left and right answers, "if u are going up take me as well"

        return left; // or right as they both are same
    }

    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        subSeq("", "abc", list);
//        System.out.println(list);

        System.out.println(subSeqList("", "abc"));
    }
}
