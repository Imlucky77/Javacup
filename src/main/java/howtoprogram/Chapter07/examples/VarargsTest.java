package howtoprogram.Chapter07.examples;

/**
 * @author imlucky
 * @Created: 2019/02/28
 * @Examples: Fig. 7.20: VarargsTest.java
 */
public class VarargsTest {
    public static double average(double... numbers) {
        double total = 0.0;

        for (double d : numbers) {
            total += d;
        }
        return total / numbers.length;
    }

    public static void main(String[] args) {
        double d1 = 10.0;
        double d2 = 20.0;
        double d3 = 30.0;
        double d4 = 40.0;

        System.out.printf("d1 = %.1f, d2 = %.1f, d3 = %.1f, d4 = %.1f %n", d1, d2, d3, d4);

        System.out.printf("Average of d1 and d2 is %.1f%n", average(d1, d2));
        System.out.printf("Average of d1,d2 and d3 is %.1f%n", average(d1, d2, d3));
        System.out.printf("Average of d1,d2,d3 and d4 is %.1f%n", average(d1, d2, d3, d4));
    }
}
