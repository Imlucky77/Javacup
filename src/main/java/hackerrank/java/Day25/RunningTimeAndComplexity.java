package hackerrank.java.Day25;

import java.util.Scanner;

public class RunningTimeAndComplexity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();

        for (int i = 0; i < in; i++) {

            int n = scanner.nextInt();
            int count = 0;

            if (n == 1) {
                System.out.println("Not prime");
            } else {
                for (int j = 2; j * j <= n; j++) {
                    if (n % j == 0) {
                        count++;
                    }
                }

                if (count == 0) {
                    System.out.println("prime");
                } else {
                    System.out.println("Not prime");
                }
            }
        }

    }
}