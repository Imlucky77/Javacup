package howtoprogram.Chapter02.exercises.exercise_16;

import java.util.Scanner;

/**
 * @author imlucky
 *  Exercise 2.16
 */

public class Comparision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first integer: ");
        int first = input.nextInt();
        System.out.println("Please enter second integer: ");
        int second = input.nextInt();

        if (first > second) {
            System.out.println(first + " is larger than " + second);
        } else if (second > first) {
            System.out.println(second + " is larger than " + first);
        } else {
            System.out.println("These numbers are equal");
        }
    }
}
