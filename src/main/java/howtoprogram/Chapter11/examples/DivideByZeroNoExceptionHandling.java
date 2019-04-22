package howtoprogram.Chapter11.examples;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/03/05
 * @Examples: Fig. 11.3: DivideByZeroNoExceptionHandling.java
 */
public class DivideByZeroNoExceptionHandling {
    public static int quotient(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        //int a;
        Scanner input = new Scanner(System.in);
        boolean continueLoop = true;
        do {
            try {
                int a;
                System.out.print("Please enter an integer numerator: ");
                int numerator = input.nextInt();
                System.out.print("Please enter an integer denominator: ");
                int denominator = input.nextInt();
                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
                continueLoop = false;
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nException: %s%n", inputMismatchException);
                input.nextLine();
                System.out.printf("You must enter integers. Please try again.%n%n");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("Zero is an invalid denominator. Please try again.%n%n");
            }

        } while (continueLoop);
    }
}
