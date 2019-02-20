package howtoprogram.Chapter06.exercises.exercise_18;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/02/19
 * @Exercise: 6.18
 */
public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter side of square (-1 to exit): ");
            int i = input.nextInt();
            if (i == -1) {
                break;
            }
            squareOfAsterisks(i);
        }
    }

    public static void squareOfAsterisks(int side) {
        for (int i = 0; i < side; i++) {
            System.out.println();
            for (int j = 0; j < side; j++) {
                System.out.print('*');
            }
        }
        System.out.println();
    }
}
