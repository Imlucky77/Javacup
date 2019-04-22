package howtoprogram.Chapter02.exercises.exercise_35;

import java.util.Scanner;


/**
 * @author imlucky
 * Body Mass Index Calculator
 * 2.35
 */
public class CarPoolSavingCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This Application Calculates Your Daily Driving Cost");

        System.out.println();

        System.out.print("Enter Total Kilometers Driven Per Day: ");
        int totalKilometers = input.nextInt();
        System.out.print("Enter Cost Per Gallon Of Gasoline: ");

        int gasolineCost = input.nextInt();
        System.out.print("Enter Average Kilometers Per Gallon: ");
        int kilometersPerGallon = input.nextInt();
        System.out.print("Enter Parking Fees Per Day: ");
        int parkingFees = input.nextInt();
        System.out.print("Enter Tolls Per Day: ");
        int tolls = input.nextInt();


        int dailyDrivingCost = (totalKilometers / kilometersPerGallon) * gasolineCost + parkingFees + tolls;
        System.out.println("Your Daily Driving Cost Is: " + dailyDrivingCost);
        int monthlyDrivingCost = dailyDrivingCost * 30;
        System.out.println("Your Monthly Driving Cost Is: " + monthlyDrivingCost);
    }
}
