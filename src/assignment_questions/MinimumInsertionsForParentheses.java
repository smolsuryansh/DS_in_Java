package assignment_questions;

import java.util.Stack;

public class MinimumInsertionsForParentheses {
    // Leetcode 1541, Minimum Insertions To Balance A Parentheses String
    public int minInsertions (String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    count++;
                }

                if (i+1 < s.length() && s.charAt(i+1) == ')') {
                    i++;
                } else {
                    count++;
                }

            } else {
                stack.push(ch);
            }
        }
        return stack.size() * 2 + count;
    }
}
