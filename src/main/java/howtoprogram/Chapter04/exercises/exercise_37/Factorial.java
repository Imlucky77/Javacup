package howtoprogram.Chapter04.exercises.exercise_37;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/01/30
 * @Exercise: 4.37
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // A
        System.out.print("Enter a number to compute its factorial: ");
        int f = input.nextInt();
        System.out.printf("The factorial of %d = %d%n", f, getFactorial(f));

        // B
        System.out.print("Enter the number of times to calculate e: ");
        int n = input.nextInt();
        System.out.printf("e = %.2f%n", getConstantE(n));

        // C
        System.out.print("Enter the number of times to calculate e^x: ");
        n = input.nextInt();

        System.out.print("Enter x: ");
        int x = input.nextInt();

        System.out.printf("e^%d %d times = %.2f%n", n, n, getValueE(n, x));
    }

    // A - compute and return factorial
    private static int getFactorial(int x) {
        int factorial = x;

        if (x > 1)
            x--;

        while (x > 0) {
            factorial *= x;
            x--;
        }
        return factorial;
    }

    // B - compute mathematical constant e
    private static double getConstantE(int x) {
        double e = 1.0;

        int i = 1;
        while (i <= x) {
            e += 1.0 / getFactorial(i);
            i++;
        }
        return e;
    }

    // C - compute value of e^x.
    private static double getValueE(int n, int x) {
        double e = 1.0;

        int i = 1;
        while (i <= n) {
            e += x / getFactorial(i);
            x = (int) Math.pow(x, i);
            i++;
        }
        return e;
    }

}
