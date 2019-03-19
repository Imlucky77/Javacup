package howtoprogram.Chapter16.examples;

import java.util.PriorityQueue;

/**
 * @author imlucky
 * @Created: 2019/03/18
 * @Examples: Fig. 16.15: PriorityQueueTest.java
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Double> queue = new PriorityQueue<>();

        queue.offer(3.2);
        queue.offer(6.8);
        queue.offer(7.5);

        System.out.println("Pulling from queue: ");

        while (queue.size() > 0) {
            System.out.printf("%.1f %n", queue.peek());
            queue.poll();
        }

        System.out.println("Finally the queue is empty: " + queue);
    }
}
