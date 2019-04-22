package free.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo implements Runnable {

    private Thread thread;
    private String name;

    public RunnableDemo(String name) {
        this.name = name;
        System.out.println("creating " + this.name);
    }

    @Override
    public void run() {

        System.out.println("running " + name);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread " + name + "," + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("thread " + name + " interrupt");
        }
        System.out.println("thread " + name + " exiting");
    }

    public void start() {
        System.out.println("starting " + name);
        if (thread == null) {
            thread = new Thread(this, name);
            thread.start();
        }
    }

    public static void main(String[] args) {
        RunnableDemo rd = new RunnableDemo("Thread-1");
        //rd.start();

        RunnableDemo rd2 = new RunnableDemo("Thread-2");
        //rd2.start();
        ExecutorService myController = Executors.newSingleThreadExecutor();
        myController.submit(rd);
        myController.submit(rd2);
    }
}
