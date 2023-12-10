package stacks;

import java.util.ArrayList;

public class stacks_using_al {
    static class StackAL{
        static ArrayList<String> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        // PUSH
        public static void push(String data){
            list.add(data);
        }

        // POP
        public static String pop(){
            if(isEmpty()){
                System.out.println("The stack is empty");
            }
            String top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // PEEK
        public static String peek(){
            if(isEmpty()){
                System.out.println("The stack is empty");
            }
            return list.remove(list.size() - 1);
        }


        public static void main(String[] args) {
            StackAL s = new StackAL();

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
}
