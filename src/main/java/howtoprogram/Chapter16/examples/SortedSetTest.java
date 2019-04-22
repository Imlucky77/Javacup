package howtoprogram.Chapter16.examples;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author imlucky
 * @Created: 2019/03/18
 * @Examples: Fig. 16.17: SortedSetTest.java
 */
public class SortedSetTest {
    public static void main(String[] args) {
        String[] colors = {"yellow", "green", "black", "tan", "grey",
                "white", "orange", "red", "green"};
        SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));

        System.out.println("Sorted tree: ");
        printSet(tree);

        System.out.print("HeadSet (\"orange\"): ");
        printSet(tree.headSet("orange"));

        System.out.print("TailSet (\"orange\"): ");
        printSet((tree.tailSet("orange")));
        System.out.printf("first: %s%n", tree.first());
        System.out.printf("last: %s%n", tree.last());
    }

    private static void printSet(SortedSet<String> set) {
        for (String s : set) {
            System.out.printf("%s ", s);
        }

        System.out.println();
    }
}
