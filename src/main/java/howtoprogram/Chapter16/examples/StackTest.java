package howtoprogram.Chapter16.examples;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author imlucky
 * @Created: 2019/03/18
 * @Examples: Fig. 16.14: StackTest.java
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();

        stack.push(12L);
        System.out.println("Pushed 12L");
        printStack(stack);
        stack.push(3456);
        System.out.println("Pushed 3456");
        printStack(stack);
        stack.push(1.0F);
        System.out.println("Pushed 1.0F");
        printStack(stack);
        stack.push(1234.567);
        System.out.println("Pushed 1234.567");
        printStack(stack);

        try {
            Number removedObjects = null;
            while (true) {
                removedObjects = stack.pop();
                System.out.printf("Popped %s%n", removedObjects);
                printStack(stack);
            }
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
    }

    public static void printStack(Stack<Number> stack) {

        if (stack.isEmpty()) {
            System.out.printf("Stack is empty%n%n");
        } else {
            System.out.printf("Stack contains: %s (top)%n", stack);
        }
    }
}
