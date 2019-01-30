package howtoprogram.Chapter04.exercises.exercise_29;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/01/30
 * @Exercise: 4.29
 */
public class PrintSquare {
    public static void main(String[] args) {

        int sides = 0;
        Scanner input = new Scanner(System.in);

        while (sides == 0) {
            System.out.print("Enter a number between 1 and 20: ");
            int number = input.nextInt();

            if (number > 0 && number <= 20) {
                sides = number;
            }
        }

        int i = 0;
        while (i < sides) {
            if (i == 0 || i == sides - 1) {
                int j = 0;
                while (j < sides) {
                    System.out.print("*");
                    j++;
                }
            } else {
                System.out.print("*");
                int j = 0;
                while (j < sides - 2) {
                    System.out.print(" ");
                    j++;
                }
                System.out.print("*");
            }
            System.out.println();
            i++;
        }

    }
}
