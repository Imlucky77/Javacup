package free.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new LinkedList<>();

    public void addStack(char ch) {
        stack.push(ch);
    }

    public void addQueue(char ch) {
        queue.add(ch);
    }

    public char removeStack() {
        return stack.pop();
    }

    public char removeQueue() {
        return queue.remove();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] chars = input.toCharArray();

        Palindrome palindrome = new Palindrome();

        for (char c : chars) {
            palindrome.addStack(c);
            palindrome.addQueue(c);
        }

        boolean isPalindrome = true;
        // why chars.length / 2
        for (int i = 0; i < chars.length / 2; i++) {
            if (palindrome.removeStack() != palindrome.removeQueue()) {
                isPalindrome = false;
            }
        }

        System.out.println("The word '" + input + "' " +
                (!isPalindrome ? "is not palindrome." : "is palindrome"));
    }

}
