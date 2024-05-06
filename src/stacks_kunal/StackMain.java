package stacks_kunal;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);
        System.out.println("Custom Stack: ");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }

        DynamicStack stack1 = new DynamicStack(5); // can also do CustomStack stack1 = new DynamicStack(5);
        System.out.println("Dynamic Stack: ");
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);

        for (int i = 0; i < 6; i++) {
            System.out.println(stack1.pop());
        }
    }
}
