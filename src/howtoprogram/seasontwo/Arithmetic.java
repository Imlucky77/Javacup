package howtoprogram.seasontwo;

import java.util.Scanner;

/**
 * @author imlucky
 * 2.17
 */
public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first integer: ");
        int first = input.nextInt();
        System.out.println("Please enter second integer: ");
        int second = input.nextInt();
        System.out.println("Please enter third integer: ");
        int third = input.nextInt();

        int sum = first + second + third;
        System.out.println("Sum is: " + sum);

        int average = (first + second + third) / 3;
        System.out.println("Average is:  " + average);

        int product = first * second * third;
        System.out.println("Product is: " + product);

        if (first > second & first > third) {
            System.out.println(first + " is largest");
        } else if (second > first & second > third) {
            System.out.println(second + " is largest");
        } else if (third > first & third > second) {
            System.out.println(third + " is largest");
        }
        if (first < second & first < third) {
            System.out.println(first + " is smallest");
        } else if (second < first & second < third) {
            System.out.println(second + " is smallest");
        } else if (third < first & third < second) {
            System.out.println(third + " is smallest");
        }
    }
}