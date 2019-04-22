package howtoprogram.Chapter06.exercises.exercise_22;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/02/19
 * @Exercise: 6.22
 */
public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            printMenu();

            int choice = input.nextInt();

            if (choice == 9) {
                break;
            }

            if (choice == 1) {
                System.out.print("\nTemperature in celsius: ");
                System.out.printf("Temperature in fahrenheit: %.2f%n%n",
                        fahrenheit(input.nextDouble()));
            } else {
                System.out.print("\nTemperature in Fahrenheit: ");
                System.out.printf("Temperature in celsius: %.2f%n%n",
                        celsius(input.nextDouble()));
            }
        }
    }

    public static void printMenu() {
        System.out.println("********");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("9. Quit.");
        System.out.println("********");
        System.out.print("> ");
    }

    public static double celsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }

    public static double fahrenheit(double celsius) {
        return 9.0 / 5.0 * celsius + 32;
    }
}
