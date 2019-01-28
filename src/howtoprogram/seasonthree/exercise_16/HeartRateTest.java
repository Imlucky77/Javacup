package howtoprogram.seasonthree.exercise_16;

import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Profile: ");
        System.out.print("FirstName is: ");
        String firstName = input.nextLine();
        System.out.print("LastName is: ");
        String lastName = input.nextLine();
        System.out.print("Day is: ");
        int day = input.nextInt();
        System.out.print("Month is: ");
        int month = input.nextInt();
        System.out.print("Year is: ");
        int year = input.nextInt();


        HeartRate heartRate = new HeartRate(firstName, lastName, day, month, year);
        long personAge = heartRate.getAge();
        System.out.println("Age is: " + personAge);


        double maximumHeartRate = heartRate.getMaxHeartRate();
        System.out.println("MaximumHeartRate is: " + maximumHeartRate);


        double targetHeartRate = heartRate.getTargetHeartRate();
        System.out.println("TargetHeartRate is: " + targetHeartRate);
    }
}
