package stacks;

// Reversing a stack

import java.util.Stack;

public class question2_stacks {
    static class StackQues2 {
        public static void PushAtBottom(String data, Stack<String> s){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            String top = s.pop();
            PushAtBottom(data, s);
            s.push(top);
        }

        public static void Reverse(Stack<String> s){
            if(s.isEmpty()){
                return;
            }
            String top = s.pop();
            Reverse(s);
            PushAtBottom(top, s);
        }

        public static void main(String[] args) {
            Stack<String> s = new Stack<>();
            s.push("1");
            s.push("2");
            s.push("3");

            Reverse(s);

            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
        }
    }
}
