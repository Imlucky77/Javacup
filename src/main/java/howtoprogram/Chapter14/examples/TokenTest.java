package howtoprogram.Chapter14.examples;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/03/12
 * @Examples: Fig. 14.18: TokenTest.java
 */
public class TokenTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence and press Enter: ");

        String sentence = input.nextLine();
        String[] tokens = sentence.split("-");
        System.out.printf("Number of elements: %d%nThe tokens are:%n",
                tokens.length);
        for (String charArray : tokens) {
            System.out.println(charArray);
        }
    }

}
