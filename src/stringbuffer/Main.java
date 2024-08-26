package stringbuffer;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int size = 5;
        String name = RandomString.generate(size);
        System.out.println(name);

        // remove whitespaces
        String sentence = "hi i h ii ahs iash isahd";
        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\s", ""));

        // split
        String arr = "Soryons Sonjol Jett Somon";
        String[] names = arr.split(" ");
        System.out.println(Arrays.toString(names));

        // rounding off
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(7.2));
    }
}
