package queue;

class CircularQueueArray {
    int MAX_SIZE;
    String array[];
    int rear = -1;
    int front = -1;

    CircularQueueArray(int size){
        MAX_SIZE = size;
        array = new String[MAX_SIZE];
    }

    boolean isEmpty(){
        return rear == -1 && front == -1;
    }

    boolean isFull(){
        return (rear + 1) % MAX_SIZE == front;
    }

    void add(String n){
        if(isFull()){
            System.out.println("The queue is full");
            return;
        }
        if(front == -1){
            front = 0;
        }
        rear = (rear+1) % MAX_SIZE;
        array[rear] = n;
    }

    String remove(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return null;
        }
        else{
            String result = array[front];
            // SINGLE ELEMENT CONDITION
            if(rear == front){
                rear = front = -1;
            }
            else {
                front = (front + 1) % MAX_SIZE;
            }
            return result;
        }
    }

    String peek(){
        if(isEmpty()){
            System.out.println("The queue is empty");
        }
        String result = array[front];
        return result;
    }
}

public class circular_queue_using_array {
    public static void main(String[] args) {
        CircularQueueArray quepasa = new CircularQueueArray(5);

        //ADDING ELEMENTS
        quepasa.add("Steve");
        quepasa.add("Harold");
        quepasa.add("Chad");
        quepasa.add("Karen");
        quepasa.add("Messi");

        // Removing from queue
        quepasa.remove();

//        quepasa.add("Ramos");
//
//        quepasa.remove();
//
//        quepasa.add("Ronaldo");

        // Viewing the queue
        while(!quepasa.isEmpty()){
            System.out.println(quepasa.peek());
            quepasa.remove();
        }
    }
}
