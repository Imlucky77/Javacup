package howtoprogram.Chapter04.examples;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            // Was corrected for exercise 4.24
            while (result != 1 && result != 2) {
                System.out.print("Please enter correct result(1 or 2): ");
                result = input.nextInt();
            }
            //*************************

            if (result == 1) {
                passes = passes + 1;
            } else {
                failures = failures + 1;
            }
            studentCounter = studentCounter + 1;
        }

        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }
}