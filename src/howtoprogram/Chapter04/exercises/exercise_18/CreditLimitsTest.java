package howtoprogram.Chapter04.exercises.exercise_18;

import java.util.Scanner;

public class CreditLimitsTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CreditLimits creditLimits = new CreditLimits();

        int accNo;
        int chargesTotal;
        int startBalance;
        int creditLimit;
        int creditsTotal;
        char cont = 'y';

        while (cont != 'n') {
            System.out.print("Enter customer account number: ");
            accNo = input.nextInt();

            startBalance = requestInput("Enter start balance for account " + accNo + ": ", input);
            chargesTotal = requestInput("Enter total monthly charges for account " + accNo + ": ", input);
            creditsTotal = requestInput("Enter total monthly credits for account " + accNo + ": ", input);
            creditLimit = requestInput("Enter credit limit for account " + accNo + ": ", input);

            creditLimits.setAccountInfo(accNo, startBalance,
                    chargesTotal, creditsTotal, creditLimit);

            System.out.printf("CREDIT INFORMATION FOR ACCOUNT %d%n", accNo);

            System.out.printf("Starting balance: %d%n", creditLimits.getStartBalance());
            System.out.printf("Credit Limit: %d%n", creditLimits.getCreditLimit());
            System.out.printf("Total Charges: %d%n", creditLimits.getTotalCharges());
            System.out.printf("Total Credits: %d%n", creditLimits.getTotalCredits());
            System.out.printf("New Balance: %d%n", creditLimits.getNewBalance());

            if (creditLimits.creditExceeded())
                System.out.println("Credit limit exceeded.");

            System.out.print("Calculate credit for another account? (y/n): ");
            cont = input.next().charAt(0);
        }


    }

    public static int requestInput(String s, Scanner sc) {
        System.out.print(s);
        return sc.nextInt();
    }
}
