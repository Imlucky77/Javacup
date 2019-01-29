package howtoprogram.Chapter04.exercises.exercise_20;

import java.util.Scanner;

public class SalaryCalculatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SalaryCalculator salaryCalc = new SalaryCalculator();

        int i = 0;
        while (i < 3) {

            System.out.printf("Employee %d weekly hours: ", i);
            salaryCalc.setHours(input.nextDouble());

            System.out.printf("Employee %d hourly pay: ", i);
            salaryCalc.setPay(input.nextDouble());

            System.out.printf("Employee %d gross pay: %.2f%n", i, salaryCalc.calculateGrossPay());
            i++;
        }
    }
}
