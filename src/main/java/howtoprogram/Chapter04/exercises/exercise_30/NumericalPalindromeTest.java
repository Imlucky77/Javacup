package howtoprogram.Chapter04.exercises.exercise_30;

import java.util.Scanner;

public class NumericalPalindromeTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        NumericalPalindrome np = new NumericalPalindrome();

        while (true) {
            System.out.print("Enter a 5 digit number to test: ");
            int testCase = input.nextInt();

            if (np.validate(testCase)) {
                if (np.isPalindrome(testCase)) {
                    System.out.println(testCase + " is a palindrome.");
                    break;
                } else {
                    System.out.println(testCase + " is not a palindrome.");
                    break;
                }
            }
        }
    }
}

