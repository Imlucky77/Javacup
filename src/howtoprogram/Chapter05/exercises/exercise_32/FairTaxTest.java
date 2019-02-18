package howtoprogram.Chapter05.exercises.exercise_32;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/02/16
 * @Exercise: 5.32
 */
public class FairTaxTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FairTax ft = new FairTax();

        int choice = 0;

        while (choice != -1) {
            ft.showMenu();
            choice = input.nextInt();

            if (choice > 0) {
                ft.calculateTax(choice);
            }
            ft.showSavings();
        }
    }
}
