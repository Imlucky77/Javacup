package hackerrank.java.Day16;

import java.util.Scanner;

public class ExceptionsStringToInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            int parseInt = Integer.parseInt(S);
            System.out.println(parseInt);
        } catch (Exception e) {
            System.out.println("Bad String");
        }

    }
}
