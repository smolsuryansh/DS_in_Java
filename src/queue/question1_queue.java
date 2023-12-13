package queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class question1_queue {
    static class QueueQues {
        static Stack<String> s1 = new Stack<>();
        static Stack<String> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(String data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        public static String remove(){
            if(isEmpty()){
                System.out.println("The queue is empty");
            }
            return s1.pop();
        }

        public static String peek(){
            if(isEmpty()){
                System.out.println("The queue is empty");
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        QueueQues q = new QueueQues();

        q.add("Karen");
        q.add("Chad");
        q.add("Steve");
        q.add("Harold");

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
