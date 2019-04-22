package howtoprogram.Chapter16.examples;

import java.util.*;

/**
 * @author imlucky
 * @Created: 2019/03/18
 * @Examples: Fig. 16.16: SetTest.java
 */
public class SetTest {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "blue", "green", "gray",
                "orange", "tan", "white", "cyan", "peach", "gray", "orange"};

        List<String> list = Arrays.asList(colors);
        System.out.println("List is: " + list);

        printNonDuplicates(list);
    }

    public static void printNonDuplicates(Collection<String> values) {
        Set<String> set = new HashSet<>(values);

        System.out.printf("%nNonduplicates are: ");

        for (String value : set) {
            System.out.printf("%s ", value);
        }
        System.out.println();
    }
}
