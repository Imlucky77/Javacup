package howtoprogram.Chapter02.exercises.exercise_15;

import java.util.Scanner;

/**
 * @author imlucky
 * @Exercise: 2.15
 */
public class PrintSentence {
    public static void main(String[] args) {

//        System.output.println("This is a Java program ");
//        System.output.printf("%s\n%s", "This is a java ", "program");

        //2.6
        /*Scanner input = new Scanner(System.in);
        int result;
        System.output.println("please enter first integer: ");
        int x = input.nextInt();
        System.output.println("please enter second integer: ");
        int y = input.nextInt();
        System.output.println("please enter third integer: ");
        int z = input.nextInt();

        result = x * y * z;
        System.output.printf("Product is %d%n ", result);*/


        /*System.output.println("1,2 " + " 3,4");
        System.output.printf("%d\t%d\t%d\t%d", 1, 2, 3, 4);*/

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first integer: ");
        int first = input.nextInt();
        System.out.println("Please enter second integer: ");
        int second = input.nextInt();

        int sum = first + second;
        System.out.println("sum is: " + sum);

        int product = first * second;
        System.out.println("multi is: " + product);

        int difference = first - second;
        System.out.println("minus is: " + difference);

        int division = first / second;
        System.out.println("divide is: " + division);
    }
}
