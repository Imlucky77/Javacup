package howtoprogram.Chapter14.examples;

/**
 * @author imlucky
 * @Created: 2019/03/11
 * @Examples: Fig. 14.4: StringStartEnd.java
 */
public class StringStartEnd {
    public static void main(String[] args) {
        String[] startEnd = {"started", "starting", "ended", "ending"};

        for (String string : startEnd) {
            if (string.startsWith("st")) {
                System.out.printf("\"%s\" starts with \"st\"%n", string);
            }
        }
        System.out.println();

        for (String string : startEnd) {
            if (string.startsWith("art", 2)) {
                System.out.printf("\"%s\" starts with \"art\" at position 2%n", string);
            }
        }
        System.out.println();

        for (String string : startEnd) {
            if (string.endsWith("ed")) {
                System.out.printf("\"%s\" ends with \"ed\"%n", string);
            }
        }

    }
}
