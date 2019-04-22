package howtoprogram.Chapter16.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author imlucky
 * @Created: 2019/03/18
 * @Examples: Fig. 16.12: BinarySearchTest.java
 */
public class BinarySearchTest {
    public static void main(String[] args) {

        String[] colors = {"red", "green", "white", "yellow", "pink", "black", "brown",
                "cyan", "blue", "orange", "tan", "purple"};

        List<String> list = Arrays.asList(colors);
        Collections.sort(list);
        System.out.printf("Sorted ArrayList: %s%n", list);

        printSearchResult(list, "black");
        printSearchResult(list, "red");
        printSearchResult(list, "pink");
        printSearchResult(list, "aqua");
        printSearchResult(list, "gray");
        printSearchResult(list, "teal");


    }

    public static void printSearchResult(List<String> list, String key) {
        int result = 0;

        System.out.printf("%nSearching for: %s%n", key);
        result = Collections.binarySearch(list, key);

        if (result >= 0) {
            System.out.printf("Found at index %d%n", result);
        } else {
            System.out.printf("Not Found (%d)%n", result);
        }

    }
}
