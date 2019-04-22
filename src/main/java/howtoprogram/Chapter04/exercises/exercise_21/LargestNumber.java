package howtoprogram.Chapter04.exercises.exercise_21;

/**
 * @author imlucky
 * @Created: 2019/01/29
 * @Exercise: 4.21
 */
public class LargestNumber {

    private int largest = 0;

    public void enterNumber(int x) {
        largest = Math.max(x, largest);
    }

    public int getLargest() {
        return largest;
    }
}
