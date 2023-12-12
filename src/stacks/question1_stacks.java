package stacks;

// PUSH AT BOTTOM OF THE STACK
import java.util.Stack;

public class question1_stacks {
    static class StackQues1 {
        public static void PushAtBottom(String data, Stack<String> s){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            String top = s.pop();
            PushAtBottom(data, s);
            s.push(top);
        }

        public static void main(String[] args) {
            Stack<String> s = new Stack<>();
            s.push("1");
            s.push("2");
            s.push("3");

            PushAtBottom("4", s);

            while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }
        }
    }
}
