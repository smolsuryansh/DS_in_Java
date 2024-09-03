package stringbuffer_kunal;

public class LargeStrings {
    public static void main(String[] args) {

        // Constructor 1: Empty
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        //Constructor 2: Provide string
        StringBuffer sb2 = new StringBuffer("Suryansh Dubey");
        System.out.println(sb2.capacity());

        //Constructor 3: Specify string's capacity initially
        StringBuffer sb3 = new StringBuffer(30);
        System.out.println(sb3.capacity());
        


        sb.append("WeMakeDevs");
        sb.append(" is nice");

//        sb.insert(2, " Soryonsh ");

        sb.replace(1,5, "Dubey");
        sb.delete(1, 5);

        sb.reverse();

        String str = sb.toString();
        System.out.println(str);
    }
}
