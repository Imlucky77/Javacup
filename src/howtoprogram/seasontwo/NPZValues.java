package howtoprogram.seasontwo;

import java.util.Scanner;

/**
 * @author imlucky
 * Negative, Positive and Zero Values
 * 2.32
 */
public class NPZValues {

    public static void main(String[] args) {

        int zeroNumbers = 0;
        int positiveNumbers = 0;
        int negetiveNumbers = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter number1 ");
        int number1 = input.nextInt();

        System.out.println("please enter number2 ");
        int number2 = input.nextInt();

        System.out.println("please enter number3 ");
        int number3 = input.nextInt();

        System.out.println("please enter number4 ");
        int number4 = input.nextInt();

        System.out.println("please enter number5 ");
        int number5 = input.nextInt();

        // count negative numbers
        if (number1 < 0)
            negetiveNumbers = negetiveNumbers + 1;

        if (number2 < 0)
            negetiveNumbers = negetiveNumbers + 1;

        if (number3 < 0)
            negetiveNumbers = negetiveNumbers + 1;

        if (number4 < 0)
            negetiveNumbers = negetiveNumbers + 1;

        if (number5 < 0)
            negetiveNumbers = negetiveNumbers + 1;

        // count zero numbers
        if (number1 == 0)
            zeroNumbers = zeroNumbers + 1;

        if (number2 == 0)
            zeroNumbers = zeroNumbers + 1;

        if (number3 == 0)
            zeroNumbers = zeroNumbers + 1;

        if (number4 == 0)
            zeroNumbers = zeroNumbers + 1;

        if (number5 == 0)
            zeroNumbers = zeroNumbers + 1;

        // count positive numbers
        if (number1 > 0)
            positiveNumbers = positiveNumbers + 1;

        if (number2 > 0)
            positiveNumbers = positiveNumbers + 1;

        if (number3 > 0)
            positiveNumbers = positiveNumbers + 1;

        if (number4 > 0)
            positiveNumbers = positiveNumbers + 1;

        if (number5 > 0)
            positiveNumbers = positiveNumbers + 1;

        System.out.println("zero numbers: " + zeroNumbers + "\n"
                + "positive numbers: " + positiveNumbers + "\n"
                + "negative numbers: " + negetiveNumbers);


    }

}
