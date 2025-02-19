package assignment_questions;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {

    }

    public static List<String> generateParentheses(int n) {
        StringBuilder stack = new StringBuilder();
        List<String> result = new ArrayList<>();
        backtrack(0, 0, n, result, stack);
        return result;
    }

    public static void backtrack(int openCount, int closedCount, int n, List<String> result, StringBuilder stack) {
        if (openCount == closedCount && openCount == n) {
            result.add(stack.toString());
            return;
        }

        if (openCount < n) {
            stack.append('(');
            backtrack(openCount + 1, closedCount, n, result, stack);
            stack.deleteCharAt(stack.length() - 1);
        }
        if (closedCount < openCount) {
            stack.append(')');
            backtrack(openCount, closedCount + 1, n, result, stack);
            stack.deleteCharAt(stack.length() - 1);
        }
    }
}
