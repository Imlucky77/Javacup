package howtoprogram.Chapter06.exercises.exercise_09;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/02/18
 * @Exercise: 6.9
 */
public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = 0.0f;
        double y = 0.0f;

        while (x != -1) {
            System.out.print("Enter number for rounding (-1 to exit): ");
            x = input.nextDouble();
            y = Math.floor(x + 0.5f);
            System.out.printf("Original: %.2f%nRounded: %d%n", x, (int) y);
        }
    }
}
