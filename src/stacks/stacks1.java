package stacks;

import java.util.Stack;


public class stacks1 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

//        System.out.println(stack.empty());
        stack.push("Call of Duty MW");
        stack.push("Minecraft");
        stack.push("CSGO");
        stack.push("R6S");
        stack.push("GTA 5");

        String topGame = stack.peek();
//        String playingNow = stack.pop();
        System.out.println(topGame);
        System.out.println(stack);
        System.out.println(stack.search("R6S"));
    }
}
