package dastgarmi.D05;

import java.util.Random;

public class Generator {
    private static final Random random = new Random();

    public static void main(String[] args) {
        if (random.nextBoolean()) {
            Integer r1 = new Integer((int) (rand() * 100 - random.nextDouble()));
            if (r1 >= -1) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        } else {
            double rand = 10 + rand() * 10;
            long r1 = (int) rand;
            long r2 = Math.round(rand);
            if (r2 > r1 && r2 <= 20)
                System.out.println(3);
            else
                System.out.println(4);
        }
    }

    private static double rand() {
        return Math.random();
    }
}