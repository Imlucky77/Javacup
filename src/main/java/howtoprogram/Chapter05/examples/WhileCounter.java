package howtoprogram.Chapter05.examples;

public class WhileCounter {
    public static void main(String[] args) {

        double amount;
        double principal = 1000.0;
        double rate = 0.05;

        System.out.printf("%s%25s%n", "Year", "Account on deposit");

        for (int year = 1; year <= 10; ++year) {
            amount = principal * Math.pow(1.0 + rate, year);

            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
}
