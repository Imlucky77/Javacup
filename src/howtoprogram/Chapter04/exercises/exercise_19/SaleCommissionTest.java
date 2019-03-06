package howtoprogram.Chapter04.exercises.exercise_19;

import java.util.Scanner;

public class SaleCommissionTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SaleCommission saleCommission = new SaleCommission();

        int item = 0;
        while (item != 9) {
            System.out.print("Enter the number(1-4) of the item sold (9 to exit): ");
            item = input.nextInt();
            //saleCommission.valueItems(item);
        }

        if (saleCommission.getSalesTotal() > 0) {
            System.out.println();
            System.out.printf("Weekly sales total: %.2f%n", saleCommission.getSalesTotal());
            System.out.printf("Weekly getPaymentAmount: %.2f%n", saleCommission.calculateCommission());
        }

    }
}
