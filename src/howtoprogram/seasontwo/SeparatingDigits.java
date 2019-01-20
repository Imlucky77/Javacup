package howtoprogram.seasontwo;

import java.util.Scanner;

/**
 * @author imlucky
 * 2.30
 */
public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();

        int digit5 = number % 10;
        int digit4 = (number % 100) / 10;
        int digit3 = (number % 1000) / 100;
        int digit2 = (number % 10000) / 1000;
        int digit1 = number / 10000;

        System.out.printf("%d   %d   %d   %d   %d   ", digit1, digit2, digit3, digit4, digit5);
    }
}
