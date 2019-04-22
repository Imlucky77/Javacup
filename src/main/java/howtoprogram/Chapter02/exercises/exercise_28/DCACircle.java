package howtoprogram.Chapter02.exercises.exercise_28;

import java.util.Scanner;

/**
 * @author imlucky
 * DCA(Diameter, Circumference and Area)
 * 2.28
 */

public class DCACircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter radius: ");
        int radius = input.nextInt();

        int diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;

        //this is faster
        double area = Math.PI * (radius * radius);
        //double area = Math.PI * Math.pow(radius, 2);

        System.out.printf("diameter is: %d\n", diameter);
        System.out.printf("circumference is: %f\n", circumference);
        System.out.printf("area is: %f ", area);
    }
}
