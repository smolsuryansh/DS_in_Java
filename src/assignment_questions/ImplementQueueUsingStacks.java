package assignment_questions;

import com.sun.jdi.IntegerValue;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    // Leetcode 232
    private Stack<Integer> first;
    private Stack<Integer> second;

    public ImplementQueueUsingStacks() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) {
        first.push(item);
    }

    public int remove() {
        while(!first.isEmpty()) {
            second.push(first.pop());
        }

        int removed = second.pop();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return removed;
    }

    public boolean isEmpty() {
        return first.isEmpty(); // if first empty, then queue is empty
    }

    public int peek() {
        while(!first.isEmpty()) {
            second.push(first.pop());
        }

        int peeked = second.peek();

        while(!second.isEmpty()) {
            first.push(second.pop());
        }

        return peeked;
    }
}
