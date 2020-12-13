package dastgarmi.D12;

public class Runnak implements Runnable {
    public static void main(String[] args) {
        Runnak d = new Runnak();
        new Thread(d).start();
        Thread t1 = new Thread(d);
        t1.start();
    }

    public void run() {
        for (int j = 0; j < 3; j++) {
            sleep1();
            sleep2();
        }
    }

    void sleep1() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.print("e ");
        }
    }

    synchronized void sleep2() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.print("e ");
        }
    }
}
