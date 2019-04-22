package howtoprogram.Chapter06.exercises.exercise_17;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/02/19
 * @Exercise: 6.17
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer to see if it is even(-1 exit): ");
            int x = input.nextInt();
            if (x == -1) {
                break;
            }
            System.out.printf("%d is%seven.%n", x,
                    (isEven(x) == true) ? " " : " not ");
        }
    }

    public static boolean isEven(int x) {
        return (x % 2 == 0) ? true : false;
    }
}
