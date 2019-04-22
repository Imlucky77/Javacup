package howtoprogram.Chapter06.exercises.exercise_21;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/02/19
 * @Exercise: 6.21
 */
public class QuotientCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 0-99999: ");
        displayDigits(input.nextInt());
    }

    public static int getQuotient(int a, int b) {
        return a % b;
    }

    public static int getReminder(int a, int b) {
        return a / b;
    }

    public static void displayDigits(int x) {
        int[] intValue = new int[String.valueOf(x).length()];

        for (int i = intValue.length - 1; i >= 0; i--) {
            intValue[i] = getQuotient(x, 10);
            x = getReminder(x, 10);
        }

        for (int i = 0; i < intValue.length; i++) {
            System.out.printf("%d  ", intValue[i]);
        }
        System.out.println();
    }
}
