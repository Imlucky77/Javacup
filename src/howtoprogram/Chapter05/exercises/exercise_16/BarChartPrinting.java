package howtoprogram.Chapter05.exercises.exercise_16;

import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/02/13
 * @Exercise: 5.16
 */
public class BarChartPrinting {
    public static void main(String[] args) {
        BarChartPrinting bar = new BarChartPrinting();
        Scanner input = new Scanner(System.in);
        int[] values = new int[5];
        int count = 0;

        for (int i = 0; i < 5; i++) {
            values[i] = bar.requestInput("Enter number " + ++count + ": ", input);
        }

        count = 0;
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d ", ++count);
            for (int j = 0; j < values[i]; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public int requestInput(String s, Scanner input) {
        System.out.print(s);
        return input.nextInt();
    }
}
