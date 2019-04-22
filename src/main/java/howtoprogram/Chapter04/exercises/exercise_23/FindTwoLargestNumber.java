package howtoprogram.Chapter04.exercises.exercise_23;

/**
 * @author imlucky
 * @Created: 2019/01/29
 * @Exercise: 4.23
 */
public class FindTwoLargestNumber {
    private int firstNum;
    private int secondNum;

    public void getLargest(int input) {
        if (input > firstNum) {
            secondNum = firstNum;
            firstNum = input;
        } else if (input > secondNum) {
            secondNum = input;
        }
    }

    public int getFirstNum() {
        return firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }
}
