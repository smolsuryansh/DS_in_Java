package stacks;

public class stacks_using_linked_list {
    static class Node{
        String data;
        Node next;
        public Node(String data){
            this.data = data;
            next = null;
        }
    }

    static class StackLL{
        public static Node head;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(String data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static String pop(){
            String top = head.data;
            if(isEmpty()){
                System.out.println("The stack is already empty");
            }
            head = head.next;
            return top;
        }

        public static String peek(){
            String top = head.data;
            if(isEmpty()){
                System.out.println("The stack is already empty");
            }
            return top;
        }
    }

    public static void main(String[] args) {
        StackLL s = new StackLL();

        s.push("Messi");
        s.push("Ronaldo");
        s.push("Lewandowski");
        s.push("Kimmich");
        s.push("Kroos");

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
