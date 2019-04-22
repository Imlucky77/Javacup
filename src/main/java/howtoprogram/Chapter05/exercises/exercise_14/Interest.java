package howtoprogram.Chapter05.exercises.exercise_14;

/**
 * @author imlucky
 * @Created: 2019/02/13
 * @Exercise: 5.14
 */
public class Interest {
    public static void main(String[] args) {
        double amount;
        double principal = 1000.0;
        double rate = 0.0;

        System.out.printf("%s%30s%n", "YEAR", "Amount on deposit");
        for (int r = 5; r <= 10; r++) {
            rate = r;

            System.out.printf("    Rate of interest %.2f%%%n", rate);

            for (int year = 0; year <= 10; year++) {
                amount = principal * Math.pow(1.0 + rate, year);
                System.out.printf("%4d%,25.2f%n", year, amount);
            }
        }
    }
}
