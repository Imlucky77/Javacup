package howtoprogram.seasonthree.exercise_17;

import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Profile: ");
        System.out.print("FirstName is: ");
        String firstName = input.nextLine();
        System.out.print("LastName is: ");
        String lastName = input.nextLine();
        System.out.print("Gender is: ");
        String gender = input.nextLine();
        System.out.print("Day is: ");
        int day = input.nextInt();
        System.out.print("Month is: ");
        int month = input.nextInt();
        System.out.print("Year is: ");
        int year = input.nextInt();

        System.out.print("Please enter your weight: ");
        int weight = input.nextInt();

        System.out.print("Please enter your height: ");
        int height = input.nextInt();

        HealthProfile healthProfile = new HealthProfile(firstName, lastName, gender, day, month, year, height, weight);

        long personAge = healthProfile.getAge();
        System.out.println("Age is: " + personAge);


        double maximumHeartRate = healthProfile.getMaxHeartRate();
        System.out.println("MaximumHeartRate is: " + maximumHeartRate);


        double targetHeartRate = healthProfile.getTargetHeartRate();
        System.out.println("TargetHeartRate is: " + targetHeartRate);


        System.out.println("BMI is: " + healthProfile.bodyMassIndex() + "\n");


        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9 and 29.9 ");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("30 or greater and 29.9 ");

    }
}
