package howtoprogram.Chapter05.exercises.exercise_28;

/**
 * @author imlucky
 * @Created: 2019/02/16
 * @Exercise: 5.28
 */
public class ContinueTest {
    public static void main(String[] args) {
        int count;
        for (count = 1; count <= 10; count++) {
            if (count == 5) {
                continue;
            }
            System.out.printf("%d ", count);
        }
        System.out.printf("%nBroke out of loop at count = %d%n", count);
    }
}
