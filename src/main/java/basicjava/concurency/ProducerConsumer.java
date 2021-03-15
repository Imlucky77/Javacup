package basicjava.concurency;

import java.util.LinkedList;
import java.util.List;

public class ProducerConsumer {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        Thread[] threads = {new Producer(list),new Producer(list),
                new Consumer(list),new Consumer(list)};
        threads[0].setName("Producer 1");
        threads[1].setName("Producer 2");
        threads[2].setName("Consumer 1");
        threads[3].setName("Consumer 2");
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException ex) {}
        }
        System.out.println("Finished: size="+list.size());
    }
}
class Producer extends  Thread{
    List<Integer> list;

    public Producer(List<Integer> list) {
        this.list=list;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized(list){
                Integer num = (int)(Math.random()*100);
                System.out.println("Thread name = "+Thread.currentThread().getName()+"\t"+"Added :"+num);
                list.add(num);
                list.notify();
            }
            try {
                Thread.sleep(100);
            } catch (Exception e) {}
        }
    }
}
class Consumer extends Thread{
    List<Integer> list;

    public Consumer(List<Integer> list) {
        this.list=list;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized(list){
                while (list.size()==0) {
                    try {
                        list.wait();
                    } catch (Exception e) {}
                }
                Integer delete = list.remove(0);
                System.out.println("Thread name = "+Thread.currentThread().getName()+"\t"+"Removed :"+delete);
            }
        }
    }
}

