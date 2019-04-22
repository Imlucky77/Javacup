package howtoprogram.Chapter05.exercises.exercise_33;

/**
 * @author imlucky
 * @Created: 2019/02/16
 * @Exercise: 5.33
 */
public class FBUserGrowth {
    public static void main(String[] args) {
        System.out.println("\n\nThis Program Calculates How Many Months Facebook Users Will Reach "
                + "1,000,000,000 and 2,000,000,000.");

        double n;
        double principal = 500000000.0; // initial amount before interest
        double rate = 0.05;
        double amount = 1000000000.0;

        n = Math.log(amount / principal) / Math.log(1.0 + rate);
        System.out.printf("%nUser base will be 1,000,000,000 in %d months.%n", Math.round(n * 12));
        amount = 2000000000.0;
        n = Math.log(amount / principal) / Math.log(1.0 + rate);
        System.out.printf("%nUser base will be 2,000,000,000 in %d months.%n%n", Math.round(n * 12));
    }
}
