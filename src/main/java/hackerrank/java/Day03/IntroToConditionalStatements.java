package hackerrank.java.Day03;

import java.util.Scanner;

public class IntroToConditionalStatements {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            if (n > 2 && n < 5) {
                System.out.println("Not Weird");
            } else if (n % 2 == 0) {
                if (n > 6 && n < 20) {
                    System.out.println("Weird");
                } else if (n > 20) {
                    System.out.println("Not Weird");
                }
            }
        } else {
            System.out.println("Weird");
        }
        scanner.close();
    }
}