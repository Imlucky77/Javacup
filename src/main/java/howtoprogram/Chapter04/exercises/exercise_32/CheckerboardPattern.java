package howtoprogram.Chapter04.exercises.exercise_32;

/**
 * @author imlucky
 * @Created: 2019/01/30
 * @Exercise: 4.32
 */
public class CheckerboardPattern {

    public static void main(String[] args) {
        int i = 0;
        while (i < 8) {
            if (i % 2 == 0) {
                System.out.print(" ");
            }
            int j = 0;
            while (j < 8) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
