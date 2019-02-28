package howtoprogram.Chapter07.examples;

/**
 * @author imlucky
 * @Created: 2019/02/27
 * @Examples: Fig. 7.5: SumArray.java
 */
public class SumArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 20, 20};
        int total = 0;

        for (int counter = 0; counter < array.length; counter++) {
            total += array[counter];
        }
        System.out.println("Total of array elements: " + total);
    }
}
