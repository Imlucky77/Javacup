package howtoprogram.Chapter06.exercises.exercise_19;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/02/19
 * @Exercise: 6.19
 */
public class SquareOfChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter side of square (-1 to exit): ");
            int side = input.nextInt();
            if (side == -1) {
                break;
            }
            System.out.print("Enter fill char: ");
            char fill = input.next().charAt(0);
            squareOfChar(side, fill);
        }
    }

    public static void squareOfChar(int side, char fillCharacter) {
        for (int i = 0; i < side; i++) {
            System.out.println();
            for (int j = 0; j < side; j++) {
                System.out.print(fillCharacter);
            }
        }
        System.out.println();
    }
}
