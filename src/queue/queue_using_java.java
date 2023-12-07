package queue;

class QueueArray{
    static int MAX_SIZE;
    static String array[] = new String[MAX_SIZE];
    static int rear;
    static int size;

    QueueArray(int size){
        MAX_SIZE = size;
        array = new String[MAX_SIZE];
        this.rear = -1;
        this.size = 0;
    }

    static boolean isEmpty(){
        return rear == -1;
    }

    void add(String n){
        if(rear == MAX_SIZE - 1){
            System.out.println("The queue is full");
            return;
        }
        else {
            rear++;
            array[rear] = n;
            size++;
        }
    }

    String remove(){
        if(rear == -1){
            System.out.println("The queue is empty");
            return null;
        }
        else{
            String front = array[0];
            for(int i = 0; i < rear; i++){
                array[i] = array[i+1];
            }
            rear--;
            size--;
            return front;
        }
    }

    String peek(){
        String front = array[0];
        if(rear == -1){
            System.out.println("The queue is empty");
            return null;
        }
        return front;
    }


}

public class queue_using_java {
    public static void main(String[] args) {
        QueueArray que = new QueueArray(6);

        // Adding into queue
        que.add("Steve");
        que.add("Harold");
        que.add("Chad");
        que.add("Karen");

        // Removing from queue
        que.remove();

        // Viewing the queue
        while(!que.isEmpty()){
            System.out.println(que.peek());
            que.remove();
        }
    }
}
