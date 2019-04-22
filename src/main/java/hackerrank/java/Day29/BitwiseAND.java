package hackerrank.java.Day29;

import java.util.Scanner;

public class BitwiseAND {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int max = 0;
            for (int x = 1; x <= n; x++) {
                for (int y = 1; y <= n; y++) {
                    if (x < y) {
                        int current = x & y;
                        if (current > max && current < k) {
                            max = current;
                        }
                    }
                }
            }
            System.out.println(max);

        }
        scanner.close();
    }
}
