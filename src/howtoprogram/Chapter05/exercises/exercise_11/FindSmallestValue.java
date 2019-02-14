package howtoprogram.Chapter05.exercises.exercise_11;

import java.util.Scanner;

public class FindSmallestValue {

    private int smallest;

    public void inputValues() {
        System.out.print("Enter the number of integer values to compare: ");
        Scanner input = new Scanner(System.in);
        int values = input.nextInt();

        for (int i = 0; i < values; i++) {
            System.out.printf("Enter an integer for value %d: ", i);
            int number = input.nextInt();

            if (i == 1) {
                smallest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }
    }

    public void displaySmallest() {
        System.out.println("The smallest integer is: " + smallest);
    }

}
