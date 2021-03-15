package basicjava.concurency;

public class ConcurrencyRunTests {
    public static void main(String[] args) {
        /*System.out.println("test1");
        ThreadClass thread = new ThreadClass();
        thread.run();
        System.out.println("test4");*/


        System.out.println("test 1");
        RunnableClass runnable = new RunnableClass();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("test 4");
    }
}
