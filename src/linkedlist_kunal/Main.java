package linkedlist_kunal;

public class Main {
    public static void main(String[] args) {
        /* // Singly linked list
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insert(100,4);
        list.insertLast(99);
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(2));
        list.display();

        System.out.println(list.find(2));
        System.out.println(list.get(1));
        */

        /*
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertLast(99);
        list.insert(99, 5);
        
        list.display();
        */

        CircularLinkedList list = new CircularLinkedList();
        list.insert(13);
        list.insert(23);
        list.insert(33);
        list.delete(23);
        list.display();
    }
}
