package howtoprogram.Chapter04.exercises.exercise_33;

/**
 * @author imlucky
 * @Created: 2019/01/30
 * @Exercise: 4.33
 */
public class MultiplesOf2 {
    public static void main(String[] args) {
        int infinite = 2;

        System.out.println("2");

        while (true) {
            System.out.printf("%d%n", infinite *= 2);
            //  I added myself
            if (infinite == -2147483648) {
                break;
            }
        }
    }
}
