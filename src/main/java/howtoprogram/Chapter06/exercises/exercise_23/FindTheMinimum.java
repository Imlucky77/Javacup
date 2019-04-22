package howtoprogram.Chapter06.exercises.exercise_23;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/02/19
 * @Exercise: 6.23
 */
public class FindTheMinimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 space separated numbers: ");
        System.out.printf("minimum value is: %.2f%n",
                minimum3(input.nextDouble(), input.nextDouble(), input.nextDouble()));
    }

    public static double minimum3(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }
}
