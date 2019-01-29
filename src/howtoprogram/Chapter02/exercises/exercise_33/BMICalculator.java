package howtoprogram.Chapter02.exercises.exercise_33;

import java.util.Scanner;

/**
 * @author imlucky
 * Body Mass Index Calculator
 * 2.33
 */
public class BMICalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your weight: ");
        int weightInKilograms = input.nextInt();

        System.out.println("Please enter your height: ");
        int heightInMeters = input.nextInt();

        int BMI = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("BMI is: " + BMI + "\n");


        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal: between 18.5 and 24.9 and 29.9 ");
        System.out.println("Overweight: between 25 and 29.9");
        System.out.println("30 or greater and 29.9 ");

    }

}
