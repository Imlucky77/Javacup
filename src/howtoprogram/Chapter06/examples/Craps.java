package howtoprogram.Chapter06.examples;

import java.security.SecureRandom;

/**
 * @author imlucky
 * @Created: 2019/02/17
 * @Examples: Fig. 6.8: Craps.java
 */
public class Craps {

    private enum Status {CONTINUE, WON, LOST}

    private static final SecureRandom secureRandom = new SecureRandom();
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        int myPoint = 0;
        Status getStatue;

        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN:
            case YO_LEVEN:
                getStatue = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                getStatue = Status.LOST;
                break;
            default:
                getStatue = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }
        while (getStatue == Status.CONTINUE) {
            sumOfDice = rollDice();

            if (sumOfDice == myPoint) {
                getStatue = Status.WON;
            } else if (sumOfDice == SEVEN) {
                getStatue = Status.LOST;
            }
        }

        if (getStatue == Status.WON) {
            System.out.println("Player Wins");
        } else {
            System.out.println("Player Loses");
        }
    }


    public static int rollDice() {
        int dice1 = 1 + secureRandom.nextInt(6);
        int dice2 = 1 + secureRandom.nextInt(6);
        int sum = dice1 + dice2;

        System.out.printf("Player rolled %d + %d = %d%n", dice1, dice2, sum);
        return sum;
    }
}
