package howtoprogram.Chapter04.exercises.exercise_21;

import java.util.Scanner;

public class LargestNumberTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LargestNumber ln = new LargestNumber();

        int counter = 0;
        while (counter < 10) {

            System.out.printf("%d/10. Enter a number: ", counter + 1);
            ln.enterNumber(input.nextInt());
            counter++;
        }
        System.out.printf("The largest number is: %d%n", ln.getLargest());
    }
}
