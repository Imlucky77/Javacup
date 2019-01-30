package howtoprogram.Chapter04.exercises.exercise_22;

/**
 * @author imlucky
 * @Created: 2019/01/29
 * @Exercise: 4.22
 */
public class Tabular {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("N 10*N 100*N 1000*N");
        while (i <= 5) {
            System.out.println(i + "  " + 10 * i + "   " + 100 * i + "   " + 1000 * i);
            i++;
        }
    }
}
