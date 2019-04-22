package hackerrank.java.Day18;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SolutionMethods {


    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new LinkedList<>();


    public void pushCharacter(char ch) {
        stack.push(ch);
    }

    public void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    public char popCharacter() {
        return stack.pop();
    }

    public char dequeueCharacter() {
        return queue.remove();
    }
}
