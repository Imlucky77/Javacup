package timeTest;

import java.util.Timer;
import java.util.TimerTask;

public class scheduleTest {


    public static void main(String[] args) {
        MethodReference methodReference = new MethodReference();

        Timer t = new Timer();

        t.schedule(new TimerTask() {
            @Override
            public void run() {
                methodReference.callInfo();
                System.out.println(" Run specific task at given time.");
                //t.cancel();
            }
        }, 2000,1000);
    }
}
