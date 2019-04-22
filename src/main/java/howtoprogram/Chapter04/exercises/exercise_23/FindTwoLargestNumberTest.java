package howtoprogram.Chapter04.exercises.exercise_23;

import java.util.Scanner;

public class FindTwoLargestNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FindTwoLargestNumber fTLN = new FindTwoLargestNumber();

        int i = 0;
        while (i < 10) {
            System.out.printf("%d/10.  Enter Number: ", i + 1);
            fTLN.getLargest(input.nextInt());
            i++;
        }
        System.out.println();
        System.out.println("First Largest: " + fTLN.getFirstNum());
        System.out.println("Second Largest: " + fTLN.getSecondNum());
    }
}
