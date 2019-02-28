package howtoprogram.Chapter07.examples;

/**
 * @author imlucky
 * @Created: 2019/02/27
 * @Examples: Fig. 7.2, 7.3, 7.4, 7.17: InitArray.java
 */
public class InitArray {
    public static void main(String[] args) {

        /*int[] array = new int[10];
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }*/

        /*int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 77};
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%3d %8d%n", counter, array[counter]);
        }*/

        final int ARRAY_LENGTH = 10;
        int[] array = new int[ARRAY_LENGTH];
        System.out.printf("%s%8s%n", "Index", "Value");

        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = 2 + 2 * counter;

            System.out.printf("%3d%8d%n", counter, array[counter]);
        }
    }
}
