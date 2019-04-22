package howtoprogram.Chapter04.exercises.exercise_19;

/**
 * @author imlucky
 * @Created: 2019/01/29
 * @Exercise: 4.19
 */
public class SaleCommission {

    double total;
    double basePay = 200.0;
    double commissionPercent = 0.09;

    public double valueItems(int input) {
        if (input == 1) {
            total += 239.99;
        }
        if (input == 2) {
            total += 129.75;
        }
        if (input == 3) {
            total += 92.95;
        }
        if (input == 4) {
            total += 350.89;
        }
        return total;
    }

    public double getSalesTotal() {
        return total;
    }

    public double calculateCommission() {
        return basePay + (total * commissionPercent);
    }


}
