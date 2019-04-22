package hackerrank.java.Day10;

import java.util.Scanner;

public class BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        int count = 0;
        int min = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                count++;
                if (count >= min) {
                    min = count;
                }
            } else {
                count = 0;
            }
            n = n / 2;
        }
        System.out.println(min);
        scanner.close();
    }
}
