package designpatterns.behavioral.observer;

import java.util.Scanner;

public class ObserverTest {
    public static void main(String[] args) {
        Subject sub = new Subject();
        new HexString(sub);
        new BinaryString(sub);
        new OctalString(sub);


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter Number: ");
            sub.setState(scanner.nextInt());
        }
    }
}
