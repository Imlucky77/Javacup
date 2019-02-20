package howtoprogram.Chapter06.exercises.exercise_20;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/02/19
 * @Exercise: 6.20
 */
public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle get its area: ");
        double radius = input.nextDouble();
        System.out.printf("Area: %.2f%n", circleArea(radius));
    }

    public static double circleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
