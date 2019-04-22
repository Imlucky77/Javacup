package howtoprogram.Chapter04.exercises.exercise_36;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/01/30
 * @Exercise: 4.36
 */
public class SidesOfRightTriangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SidesOfRightTriangle st = new SidesOfRightTriangle();

        System.out.print("Enter 1st side: ");
        int first = input.nextInt();

        System.out.print("Enter 2st side: ");
        int second = input.nextInt();

        System.out.print("Enter 3st side: ");
        int third = input.nextInt();

        if (st.isTriangle(first, second, third)) {
            System.out.printf("The triangle is%sright angled.%n",
                    st.isRightAngled(first, second, third) ? " " : " NOT ");
        } else {
            System.out.println("The entered values could NOT be a triangle.");
        }
    }

    public boolean isTriangle(int a, int b, int c) {
        return ((a + b > c) && (a + c > b) && (b + c > a));
    }


    public boolean isRightAngled(int a, int b, int c) {
        int hypotenuse;

        if (a > b && a > c)
            hypotenuse = a;
        else if (b > a && b > c)
            hypotenuse = b;
        else
            hypotenuse = c;

        return (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(hypotenuse, 2));
    }
}
