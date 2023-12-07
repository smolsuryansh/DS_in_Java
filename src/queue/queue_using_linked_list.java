package queue;

class QueueLL {
    static class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    boolean isEmpty(){
        return head == null && tail == null;
    }

    void add(String data){
        Node newNode = new Node(data);
        if(tail == null){
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    String remove(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return null;
        }

        String front = head.data;
        if(head==tail){
            tail = null;
        }
        head = head.next;
        return front;
    }

    String peek(){
        if(isEmpty()){
            System.out.println("The queue is empty");
        }
        return head.data;
    }
}

public class queue_using_linked_list {
    public static void main(String[] args) {
        CircularQueueArray q = new CircularQueueArray(5);

        //ADDING ELEMENTS
        q.add("Steve");
        q.add("Harold");
        q.add("Chad");
        q.add("Karen");
        q.add("Messi");

        // Removing from queue
        q.remove();

//        quepasa.add("Ramos");
//
//        quepasa.remove();
//
//        quepasa.add("Ronaldo");

        // Viewing the queue
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

