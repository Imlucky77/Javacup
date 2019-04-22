package howtoprogram.Chapter04.exercises.exercise_35;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/01/30
 * @Exercise: 4.35
 */
public class SidesOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SidesOfTriangle st = new SidesOfTriangle();

        System.out.print("Enter 1st side: ");
        int first = input.nextInt();

        System.out.print("Enter 2st side: ");
        int second = input.nextInt();

        System.out.print("Enter 3st side: ");
        int third = input.nextInt();

        System.out.printf("The entered values could%sbe a triangle%n",
                st.isTriangle(first, second, third) ? " " : " NOT ");
    }

    public boolean isTriangle(int a, int b, int c) {
        return ((a + b > c) && (a + c > b) && (b + c > a));
    }

}
