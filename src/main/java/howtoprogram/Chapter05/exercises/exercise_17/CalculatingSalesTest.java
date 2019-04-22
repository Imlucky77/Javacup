package howtoprogram.Chapter05.exercises.exercise_17;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/02/13
 * @Exercise: 5.17
 */
public class CalculatingSalesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CalculatingSalesTest salesTest = new CalculatingSalesTest();
        CalculatingSales sales = new CalculatingSales();

        int productNo;
        int quantity;

        do {
            productNo = salesTest.requestInput("Enter product number 1-5 (-1 to quit): ", input);

            if ((productNo != -1) && !(productNo > 5)) {
                quantity = salesTest.requestInput("Enter quantity for product " + productNo + ": ", input);
                sales.addProduct(productNo, quantity);
            }
        } while ((productNo != -1));
        System.out.printf("Total %.2f%n ", sales.getTotal());
    }

    public int requestInput(String s, Scanner input) {
        System.out.print(s);
        return input.nextInt();
    }
}
