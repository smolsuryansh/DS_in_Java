package assignment_questions;

import java.util.Stack;

public class ImplementQueueUsingStacksRemove {
    // Leetcode 232
    private Stack<Integer> first;
    private Stack<Integer> second;

    public ImplementQueueUsingStacksRemove() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) {
        while(!first.isEmpty()) {
            second.push(first.pop());
        }

        first.push(item);

        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }

    public int remove() {
        return first.pop();
    }

    public boolean isEmpty() {
        return first.isEmpty(); // if first empty, then queue is empty
    }

    public int peek() {
        return first.peek();
    }
}
