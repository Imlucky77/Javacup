package howtoprogram.Chapter05.exercises.exercise_24;

/**
 * @author imlucky
 * @Created: 2019/02/14
 * @Exercise: 5.24
 */
public class DiamondPrinting {
    public static void main(String[] args) {

        int extra = 0;

        for (int i = 1; i < 5; i++) {
            for (int j = 5 - i; j > 0; j--) {
                System.out.print(' ');
            }
            for (int k = 0; k < i + extra; k++) {
                System.out.print('*');
            }
            System.out.println();
            extra++;
        }

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(' ');
            }
            for (int k = 0; k < i + extra; k++) {
                System.out.print('*');
            }
            System.out.println();
            extra--;
        }
    }
}
