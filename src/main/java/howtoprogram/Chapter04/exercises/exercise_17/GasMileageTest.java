package howtoprogram.Chapter04.exercises.exercise_17;

import java.util.Scanner;

public class GasMileageTest {
    public static void main(String[] args) {

        int miles;
        int gallons;
        char cont = 'y';

        Scanner input = new Scanner(System.in);
        GasMileage mileage = new GasMileage();

        while (cont != 'n') {

            System.out.print("Enter Gas Mileage for this trip: ");
            miles = input.nextInt();
            System.out.print("Enter Gallons used for this trip: ");
            gallons = input.nextInt();

            System.out.printf("Your MPG for this trip is: %.2f%n",
                    mileage.getTripMPG(miles, gallons));

            System.out.print("Add another trip? (y/n): ");
            cont = input.next().charAt(0);
        }

        System.out.printf("Combined mileage: %.2f%nCombined gallon usage: %.2f%n",
                mileage.getTotalMiles(), mileage.getTotalGallons());
        System.out.printf("Your combined MPG for all trips is: %.2f%n", mileage.getTotalMPG());
    }
}
