package assignment_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static void main(String[] args) {
        String[] token = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(token));
    }

    public int evalRPNBrute(String[] tokens) {
        List<String> tokenList = new ArrayList<>(Arrays.asList(tokens));

        while(tokenList.size() > 1) {
            for (int i = 0; i < tokenList.size(); i++) {
                String token = tokenList.get(i);

                if ("+-*/".contains(token)) {
                    int a = Integer.parseInt(tokenList.get(i - 2));
                    int b = Integer.parseInt(tokenList.get(i - 1));

                    int result = 0;

                    if (token.equals("+")) {
                        result = a + b;
                    } else if (token.equals("-")) {
                        result = a - b;
                    } else if (token.equals("*")) {
                        result = a * b;
                    } else if (token.equals("/")) {
                        result = a / b;
                    }

                    tokenList.set(i - 2, String.valueOf(result));
                    tokenList.remove(i);
                    tokenList.remove(i - 1);
                    break;
                }
            }
        }
        return Integer.parseInt(tokenList.get(0));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String ch : tokens) {
            if (ch.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (ch.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if (ch.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (ch.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            } else {
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.pop();
    }

}
