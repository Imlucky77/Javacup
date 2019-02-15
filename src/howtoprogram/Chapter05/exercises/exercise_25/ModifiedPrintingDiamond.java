package howtoprogram.Chapter05.exercises.exercise_25;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/02/14
 * @Exercise: 5.25
 */
public class ModifiedPrintingDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an odd Number: ");
        int number = input.nextInt();

        int half = (number / 2) + 1;
        int extra = 0;

        // top half
        for (int i = 1; i < half; i++) {
            for (int j = half - i; j > 0; j--) {
                System.out.print(' ');
            }
            for (int k = 0; k < i + extra; k++) {
                System.out.print('*');
            }

            System.out.println();
            extra++;
        }

        // bottom half
        for (int i = half; i >= 0; i--) {
            for (int j = 0; j < half - i; j++) {
                System.out.print(' ');
            }
            for (int k = 0; k < i + extra; k++) {
                System.out.print('*');
            }
            System.out.println();
            extra--;
        }
    }

}
