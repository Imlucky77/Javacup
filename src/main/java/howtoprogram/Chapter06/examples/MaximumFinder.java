package howtoprogram.Chapter06.examples;

/**
 * @author imlucky
 * @Created: 2019/02/17
 * @Examples: Fig. 6.3: MaximumFinder.java
 */

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        double result = maximum(number1, number2, number3);
        System.out.println("Maximum value is: " + result);
    }

    public static double maximum(double x, double y, double z) {
        /*double maximumValue = x;

        if (y > maximumValue) {
            maximumValue = y;
        }

        if (z > maximumValue) {
            maximumValue = z;
        }

        return maximumValue;*/
        return Math.max(x, Math.max(y, z));

    }
}