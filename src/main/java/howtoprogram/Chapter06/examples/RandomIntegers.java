package howtoprogram.Chapter06.examples;

import java.security.SecureRandom;

/**
 * @author imlucky
 * @Created: 2019/02/17
 * @Examples: Fig. 6.6: RandomIntegers.java
 */
public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        for (int counter = 1; counter <= 20; counter++) {
            int face = 1 + secureRandom.nextInt(6);
            System.out.printf("%d ", face);

            if (counter % 5 == 0) {
                System.out.println();
            }
        }
    }
}
