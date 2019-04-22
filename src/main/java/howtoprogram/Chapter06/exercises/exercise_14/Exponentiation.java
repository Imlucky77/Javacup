package howtoprogram.Chapter06.exercises.exercise_14;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/02/18
 * @Exercise: 6.14
 */
public class Exponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base = 0;
        int exponent;

        while (base != -1) {
            System.out.print("Enter base (-1 to exit): ");
            base = input.nextInt();

            if (base != -1) {
                System.out.print("Enter exponent: ");
                exponent = input.nextInt();

                System.out.println(Math.pow(base, exponent));
                System.out.printf("%d^%d: %d%n",
                        base, exponent, integerPower(base, exponent));
            }
        }
    }

    public static int integerPower(int base, int exponent) {
        if (exponent <= 1) {
            return base;
        }
        return base * integerPower(base, --exponent);
    }
}
