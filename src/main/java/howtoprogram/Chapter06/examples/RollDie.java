package howtoprogram.Chapter06.examples;

import java.security.SecureRandom;

/**
 * @author imlucky
 * @Created: 2019/02/17
 * @Examples: Fig. 6.7: RollDie.java
 */
public class RollDie {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        int frequency1 = 0;
        int frequency2 = 0;
        int frequency3 = 0;
        int frequency4 = 0;
        int frequency5 = 0;
        int frequency6 = 0;

        for (int roll = 1; roll < 6000000; roll++) {
            int face = 1 + secureRandom.nextInt(6);


            switch (face) {
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;


            }
        }
        System.out.println("Face\tFrequency");
        System.out.printf("1\t\t%d%n2\t\t%d%n3\t\t%d%n4\t\t%d%n5\t\t%d%n6\t\t%d%n",
                frequency1, frequency2, frequency3, frequency4,
                frequency5, frequency6);
    }
}
