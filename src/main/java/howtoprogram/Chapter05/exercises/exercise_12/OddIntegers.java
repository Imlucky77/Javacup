package howtoprogram.Chapter05.exercises.exercise_12;

/**
 * @author imlucky
 * @Created: 2019/02/12
 * @Exercise: 5.12
 */
public class OddIntegers {
    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println("Number " + i + " is Odd");
            } else {
                System.out.println("Number " + i + " is Even");
            }
        }
    }
}
