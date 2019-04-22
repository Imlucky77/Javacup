package howtoprogram.Chapter05.exercises.exercise_20;

/**
 * @author imlucky
 * @Created: 2019/02/13
 * @Exercise: 5.20
 */
public class ValueOfPI {
    public static long TERM = 150;

    public static void main(String[] args) {
        double infiniteSeries = 0.0f;
        boolean sign = true;
        long count = 0;

        for (int i = 1; i <= TERM; i += 2) {
            if (i % 2 == 0) {
                continue;
            }

            if (sign) {
                infiniteSeries += (4.0 / i);
            } else {
                infiniteSeries -= (4.0 / i);
            }
            System.out.printf("%d. i = %d, infiniteSeries = %f%n", ++count, i, infiniteSeries);

            sign = !sign;
        }
        System.out.printf("PI calculated from the infinite series 20,000 times: %f%n", infiniteSeries);
    }
}
