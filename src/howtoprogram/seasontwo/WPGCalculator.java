package howtoprogram.seasontwo;


import java.util.Scanner;

/**
 * @author imlucky
 * World Population Growth Calculator
 * 2.34
 */
public class WPGCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Current World Population: ");
        double currentPop = input.nextDouble();

        System.out.print("Please Enter Annual Population Growth Rate: ");
        double growthRate = input.nextDouble();

        System.out.println();

        double annualPopulationIncrease = currentPop * (growthRate / 100);
        double estimatePopulation = annualPopulationIncrease + currentPop;

        System.out.println("Estimated population after one year:     " + estimatePopulation);
        System.out.println("Estimated population after two year:     " + estimatePopulation + (annualPopulationIncrease * 2));
        System.out.println("Estimated population after three year:   " + estimatePopulation + (annualPopulationIncrease * 3));
        System.out.println("Estimated population after four year:    " + estimatePopulation + (annualPopulationIncrease * 4));
        System.out.println("Estimated population after five year:    " + estimatePopulation + (annualPopulationIncrease * 5));
    }

}
