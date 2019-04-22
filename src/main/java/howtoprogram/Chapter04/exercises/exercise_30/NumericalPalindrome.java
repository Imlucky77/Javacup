package howtoprogram.Chapter04.exercises.exercise_30;

/**
 * @author imlucky
 * @Created: 2019/01/30
 * @Exercise: 4.30
 */
public class NumericalPalindrome {

    public boolean validate(int value) {
        return Integer.toString(value).length() == 5;
    }

    public boolean isPalindrome(int value) {
        int[] arrValue = new int[5];

        int i = 4;
        while (i >= 0) {
            arrValue[i] = value % 10;
            value /= 10;
            i--;
        }
        return (arrValue[0] == arrValue[4] && arrValue[1] == arrValue[3]);
    }
}
