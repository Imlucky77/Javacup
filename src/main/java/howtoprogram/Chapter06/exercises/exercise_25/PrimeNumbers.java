package howtoprogram.Chapter06.exercises.exercise_25;

/**
 * @author imlucky
 * @Created: 2019/02/19
 * @Exercise: 6.25
 */
public class PrimeNumbers {


    public static boolean isPrime(int n) {
        for (int i = 2; 2 * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
