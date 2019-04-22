package howtoprogram.Chapter11.examples;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/03/06
 * @Examples: Fig. 11.8: AssertTest.java
 */
public class AssertTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 10: ");
        int number = input.nextInt();

        assert (number >= 0 && number <= 10) : "bad number" + number;

        System.out.printf("You entered number: %d%n", number);
    }
}
