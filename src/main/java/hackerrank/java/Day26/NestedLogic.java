package hackerrank.java.Day26;

import java.util.Scanner;

public class NestedLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        int exDay = scanner.nextInt();
        int exMonth = scanner.nextInt();
        int exYear = scanner.nextInt();

        int fine = 0;


        if (year < exYear) {
            fine = 0;
        } else if (year > exYear) {
            fine = 10000;
        } else if (month > exMonth) {
            fine = 500 * (month - exMonth);
        } else if (day > exDay) {
            fine = 15 * (day - exDay);
        }

        System.out.println(fine);
    }
}
