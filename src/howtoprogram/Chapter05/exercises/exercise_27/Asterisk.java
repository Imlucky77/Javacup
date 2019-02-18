package howtoprogram.Chapter05.exercises.exercise_27;

/**
 * @author imlucky
 * @Created: 2019/02/16
 * @Exercise: 5.27
 */
public class Asterisk {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 4; k++)
                    System.out.print('*');
                System.out.println();
            } // end inner for
            System.out.println();
        }
    }
}
