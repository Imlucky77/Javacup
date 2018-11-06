package free;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        switch (n) {
            case 1:
            case 3:
            case 5:
                System.out.println("odd");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("even");
                break;
            case 7:
                System.out.println("C");
                break;
            case 8:
                System.out.println("D");
                break;
            case 10:
                System.out.println("Other Numbers");
                break;
            default:
                System.out.println("default mode");
        }
    }
}
