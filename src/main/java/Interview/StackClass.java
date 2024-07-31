package Interview;

import java.util.Stack;

public class StackClass {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack after push "+ stack);

        System.out.println("top element "+ stack.peek());

        System.out.println("Remove the top element "+ stack.pop());

        System.out.println("Stack after pop "+ stack);

        boolean isEmpty = stack.empty();
        System.out.println("Is the stack empty? " + isEmpty);

        int position = stack.search(2);
        System.out.println("Position of element 2: " + position);


    }
}
