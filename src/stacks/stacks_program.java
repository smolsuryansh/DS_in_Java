package stacks;

import javax.swing.*;
import java.util.Scanner;

class Stack{
    private int MAX_SIZE;
    private int top = -1;
    private String array[] = new String[MAX_SIZE];

    Stack(int size){
        MAX_SIZE = size;
        array = new String[MAX_SIZE];
    }

    // PUSHING INTO THE STACK
    void push(String n){
        if(top == array.length-1){
            System.out.println("Stack is full");
        }
        else {
            top = top + 1;
            array[top] = n;
        }
    }

    // POPING ELEMENTS FROM THE STACK
    String pop(){
        if (top == -1){
            System.out.println("The stack is already empty");
            return null;
        }
        else {
            String playingNow = array[top];
            array[top] = null;
            top = top - 1;
            return playingNow;
        }
    }

    void peek(){
        System.out.println("\n The game kept on the top rn is: " + array[top]);
    }

    public String peek(int index){
        if(index >= 0 && index <= top){
            return array[index];
        }
        else {
            System.out.println("Invalid index");
            return null;
        }
    }

    // DISPLAYING THE ELEMENTS OF THE STACK
    void printStack(){
        if(top == -1){
            System.out.println("The stack is empty, please fill in some elements");
        }
        else {
            System.out.println("\n Your games collection:");
            for(int i = top; i>=0; i--){
                System.out.println(array[i]);
            }
        }
    }
}

public class stacks_program {
    public static void main(String[] args) {
        Stack st = new Stack(5);

        // PUSHING
        st.push("Valorant");
        st.push("CSGO");
        st.push("GTA5");
        st.push("R6S");
        st.push("Read dead redemption 2");

        // DISPLAYING
        st.printStack();

        // POPPING
//        String playingNow = st.pop();
//        System.out.print("Game playing right now: " + playingNow);

        // PEEK
//        st.peek();

        // PEEKING FROM AN INDEX
        Scanner sc = new Scanner(System.in);
        System.out.print("Type in the index you want to peek: ");
        int index = sc.nextInt();
        String gameAt = st.peek(index);
        System.out.println("The game kept at the index " + index + " is: "  + gameAt);
    }
}
