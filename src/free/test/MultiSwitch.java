package free.test;

import java.util.Scanner;

public class MultiSwitch {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        getGrade(i);
    }


    public static void getGrade(int score) {
        if (0 <= score && score <= 5) {
            System.out.println("F");
        } else if (5 < score && score <= 10) {
            System.out.println("E");
        } else if (10 < score && score <= 15) {
            System.out.println("D");
        } else if (15 < score && score <= 20) {
            System.out.println("C");
        } else if (20 < score && score <= 25) {
            System.out.println("B");
        } else if (25 < score && score <= 30) {
            System.out.println("A");
        } else {
            System.out.println("Please insert valid number");
        }
    }
}
