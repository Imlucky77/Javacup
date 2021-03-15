package basicjava.concurency;

public class JoinClass {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.start();
        t2.start();
    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(Thread.currentThread().getName() + "\t" + i);
        }
    }
}
/*public class JoinClass {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
        } catch (InterruptedException ex) {
        }
    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.println(Thread.currentThread().getName() + "\t" + i);
        }
    }
}*/

