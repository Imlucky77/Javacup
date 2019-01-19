package howtoprogram.seasontwo;

import java.util.Scanner;

/**
 * @author imlucky
 * 2.26
 */
public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first integer: ");
        int first = input.nextInt();
        System.out.println("Please enter second integer: ");
        int second = input.nextInt();

        if (first % second == 0) {
            System.out.println(first + " is Multiples of " + second);
        } else {
            System.out.println(first + " is not Multiples of " + second);
        }
    }
}
