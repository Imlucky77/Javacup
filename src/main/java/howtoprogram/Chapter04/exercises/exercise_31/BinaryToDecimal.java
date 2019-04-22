package howtoprogram.Chapter04.exercises.exercise_31;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/01/30
 * @Exercise: 4.31
 */
public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int decimal = 0;
        int binary;
        int place = 0;

        System.out.print("Enter binary number for conversion: ");
        binary = input.nextInt();

        while (binary != 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, place);

            binary /= 10;
            place++;
        }

        System.out.println("Decimal number is = " + decimal);
    }
}
