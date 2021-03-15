package basicjava.concurency;

public class RunnableClass implements Runnable {


    @Override
    public void run() {
        System.out.println("test 2");
        System.out.println("test 3");
    }
}
