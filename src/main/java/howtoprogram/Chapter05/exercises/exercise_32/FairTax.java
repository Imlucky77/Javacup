package howtoprogram.Chapter05.exercises.exercise_32;

import java.util.ArrayList;
import java.util.Scanner;

public class FairTax {

    private static double FAIR_TAX_RATE = 0.30;

    private double[] savings = new double[7];
    private Scanner input = new Scanner(System.in);

    private ArrayList<String> categories = new ArrayList<>();

    public FairTax() {
        categories.add("Housing");
        categories.add("Food");
        categories.add("Clothing");
        categories.add("Transportation");
        categories.add("Education");
        categories.add("Health-Care");
        categories.add("Vacations");
    }

    public void showMenu() {
        System.out.println("\nEnter the number of the category to be entered.");
        for (int i = 0; i < categories.size(); i++) {
            System.out.printf("%d %s%n", i + 1, categories.get(i));
        }
        System.out.println("-1. Exit");
    }

    public void calculateTax(int i) {
        System.out.printf("%n%s%n%n", categories.get(i - 1));
        savings[i - 1] += requestInput("Enter total " + categories.get(i - 1) + " Cost: ", input) * FAIR_TAX_RATE;
    }

    public void showSavings() {
        System.out.println("\nYour Estimated Fair Tax Summary\n");
        System.out.printf("Based off of %.2f%% tax.%n%n", FAIR_TAX_RATE * 100);
        for (int i = 0; i < categories.size(); i++) {
            System.out.printf("%s: %.2f%n", categories.get(i), savings[i]);
        }
    }

    public double requestInput(String s, Scanner sc) {
        System.out.println(s);
        return sc.nextDouble();
    }
}
