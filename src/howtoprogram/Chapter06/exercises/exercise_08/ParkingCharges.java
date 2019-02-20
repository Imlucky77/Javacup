package howtoprogram.Chapter06.exercises.exercise_08;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/02/18
 * @Exercise: 6.8
 */
public class ParkingCharges {

    private static final double BASE_FEE = 2.00;
    private static final double HOURLY_FEE = 0.50;
    private static final double MAX_FEE = 10.00;
    private static double total = 0.0f;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double time = 0.0f;

        do {
            time = requestInput("Enter hours parked (-1 to exit): ", input);
            if (time > 0) {
                System.out.printf("Charges: $%.2f%n", calculateCharges(time));
            }
        } while (time != -1);
        System.out.printf("Total charges for the day: $%.2f%n", total);
    }

    public static double requestInput(String s, Scanner scanner) {
        System.out.println(s);
        return scanner.nextInt();
    }

    public static double calculateCharges(double time) {
        if (time > 3.0) {
            double fee = BASE_FEE + (HOURLY_FEE * (Math.ceil(time - 3.0)));
            total += Math.min(fee, MAX_FEE);
            return Math.min(fee, MAX_FEE);
        } else {
            total += BASE_FEE;
            return BASE_FEE;
        }
    }
}
