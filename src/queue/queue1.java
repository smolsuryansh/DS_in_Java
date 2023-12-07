package queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        // Adding to the queue
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Steve"));

        // Peeking at the head of the queue
//        System.out.println("At the front of the queue: " + queue.peek());

        // Remove the element from the head
//        System.out.println("The element removed from the queue: " + queue.poll());

        // Displaying the queue
        System.out.println(queue);
    }
}
