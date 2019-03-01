package howtoprogram.Chapter07.examples;

import java.util.Arrays;

/**
 * @author imlucky
 * @Created: 2019/02/28
 * @Examples: Fig. 7.22: ArrayManipulations.java
 */
public class ArrayManipulations {
    public static void main(String[] args) {

        double[] arraySort = {8.0, 6.0, 5.3, 5.9, 1.0, 74.2, 2.0};
        Arrays.sort(arraySort);
        System.out.printf("%ndoubleArray ");

        for (double value : arraySort) {
            System.out.printf("%.1f ", value);
        }

        int[] arrayFill = new int[10];
        Arrays.fill(arrayFill, 7);
        displayArray(arrayFill, "fieldIniArray");


        int[] intArray = {1, 2, 3, 4, 5, 6};
        int[] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "intArray");
        displayArray(intArrayCopy, "intArrayCopy");

        boolean equals = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("%n%nintArray %s intArrayCopy%n", (equals ? "==" : "!="));

        equals = Arrays.equals(intArray, arrayFill);
        System.out.printf("intArray %s filledIntArray%n", (equals ? "==" : "!="));

        int location = Arrays.binarySearch(intArray, 5);

        if (location >= 0) {
            System.out.printf("Found 5 at element %d in intArray%n", location);
        } else {
            System.out.println("5 not found in intArray");
        }

        location = Arrays.binarySearch(intArray, 8763);
        if (location >= 0) {
            System.out.printf("Found 8763 at element %d in intArray%n", location);
        } else {
            System.out.println("8763 not found in intArray");
        }
    }

    public static void displayArray(int[] array, String description) {
        System.out.printf("%n%s: ", description);

        for (int value : array) {
            System.out.printf("%d ", value);
        }
    }
}
