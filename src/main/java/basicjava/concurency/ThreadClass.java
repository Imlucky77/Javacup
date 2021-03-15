package basicjava.concurency;

public class ThreadClass extends Thread {

    @Override
    public void run() {
        System.out.println("test2");
        System.out.println("test3");
    }
}
