package howtoprogram.Chapter05.exercises.exercise_13;

/**
 * @author imlucky
 * @Created: 2019/02/12
 * @Exercise: 5.13
 */
public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        for (int i = 0; i < 20; i++) {
            System.out.println(factorial.getFactorial(i));
        }
    }

    public long getFactorial(int number) {
        long factorial = number;

        if (number > 1) {
            number--;
        }

        while (number > 0) {
            factorial *= number;
            number--;
        }
        return factorial;
    }
}
