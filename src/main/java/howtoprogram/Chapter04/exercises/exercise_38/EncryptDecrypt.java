package howtoprogram.Chapter04.exercises.exercise_38;

/**
 * @author imlucky
 * @Created: 2019/01/30
 * @Exercise: 4.38
 */
public class EncryptDecrypt {

    // ensure number is of length 4
    public boolean validate(int value) {
        return (Integer.toString(value).length() == 4) ? true : false;
    }

    // 1. Replace each digit with the result of adding 7 to it and getting the
    //    remainder after dividing the new value by 10
    public int encrypt(int value) {
        int[] arrValue = new int[4];

        // split int into array
        // countdown so as to not reverse the original order
        int i = 3;
        while (i >= 0) {
            arrValue[i] = value % 10;
            value /= 10;
            i--;
        }


        arrValue = swapDigits(arrValue);

        int j = 0;
        while (j < 4) {
            arrValue[j] = (arrValue[j] + 7) % 10;
            j++;
        }

        return toInt(arrValue);
    }

    public int decrypt(int value) {
        int[] arrValue = new int[4];

        // split int into array
        // countdown so as to not reverse the original order
        int i = 3;
        while (i >= 0) {
            arrValue[i] = value % 10;
            value /= 10;
            i--;
        }

        // swapping returns to original order
        arrValue = swapDigits(arrValue);

        // decrypt originally ordered values
        int j = 0;
        while (j < 4) {
            arrValue[j] = (((arrValue[j] + 10) - 7) % 10);
            j++;
        }

        return toInt(arrValue);
    }

    // 2. swap the first and third, second and fourth digits
    private int[] swapDigits(int[] arrValue) {
        // swap first with third
        int tempValue = arrValue[0];
        arrValue[0] = arrValue[2];
        arrValue[2] = tempValue;

        // swap second with fourth
        tempValue = arrValue[1];
        arrValue[1] = arrValue[3];
        arrValue[3] = tempValue;

        return arrValue;
    }

    // 3. convert int[] to int for easy printing
    private int toInt(int[] arrValue) {
        // convert int[] to int
        StringBuilder temp = new StringBuilder();

        int i = 0;
        while (i < arrValue.length) {
            temp.append(arrValue[i]);
            i++;
        }

        return Integer.parseInt(temp.toString());
    }
}
