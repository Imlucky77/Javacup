package howtoprogram.Chapter06.exercises.exercise_24;

/**
 * @author imlucky
 * @Created: 2019/02/19
 * @Exercise: 6.24
 */
public class PerfectNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            if (isPerfect(i)) {
                System.out.printf("%d: ", i);
                printFactors(i);
            }
        }
    }

    public static boolean isPerfect(int number) {
        int temp = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                temp += i;
            }
        }
        return (temp == number) ? true : false;
    }

    public static void printFactors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
