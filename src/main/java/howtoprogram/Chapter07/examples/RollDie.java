package howtoprogram.Chapter07.examples;

import java.security.SecureRandom;

/**
 * @author imlucky
 * @Created: 2019/02/27
 * @Examples: Fig. 7.7: RollDie.java
 */
public class RollDie {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        int[] frequency = new int[7];

        for (int roll = 1; roll <= 100; roll++) {
            ++frequency[1 + secureRandom.nextInt(6)];
        }

        System.out.printf("%s%10s%n", "Face", "Frequency");

        for (int face = 1; face < frequency.length; face++) {
            System.out.printf("%4d%10d%n", face, frequency[face]);
        }
    }
}
