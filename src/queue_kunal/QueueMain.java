package queue_kunal;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//        queue.insert(4);
//        queue.insert(5);
//
//        queue.display();
//
//        queue.remove();
//        System.out.println("After removing: ");
//        queue.display();

        CircularQueue queue1 = new CircularQueue(5);
        queue1.insert(1);
        queue1.insert(2);
        queue1.insert(3);
        queue1.insert(4);
        queue1.insert(5);

        queue1.display();

        queue1.remove();
        System.out.println("After removing: ");
        queue1.insert(6);
        queue1.display();
    }
}
