package quera.exercise;

import java.util.Scanner;

public class RepeatInString {
    public int stringInString(String one, String two) {
        if (!one.isEmpty() && !two.isEmpty()) {
            System.out.println("omad to if");
        } else {
            System.out.println(0);
        }
        return 1;
    }

    public static void main(String[] args) {
        RepeatInString rIs = new RepeatInString();

        Scanner input = new Scanner(System.in);
        System.out.print("enter one String: ");
        String one = input.nextLine();
        System.out.print("enter two String: ");
        String two = input.nextLine();

        int i = rIs.stringInString(one, two);
    }


}
