package howtoprogram.Chapter06.exercises.exercise_16;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/02/19
 * @Exercise: 6.16
 */
public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a pair of space separated integers (-1 exit): ");
            int x = input.nextInt();
            if (x != -1) {
                int y = input.nextInt();
                System.out.printf("%d as multiple of %d = %s%n", x, y, (isMultiple(x, y) == true) ? "true" : "false");
            }
            break;
        }
    }

    public static boolean isMultiple(int x, int y) {
        return (y % x == 0) ? true : false;
    }
}
