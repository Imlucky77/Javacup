package howtoprogram.Chapter07.examples;

import java.util.ArrayList;
import java.util.List;

/**
 * @author imlucky
 * @Created: 2019/03/02
 * @Examples: Fig. 7.24: ArrayListCollection.java
 */
public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        items.add("Red");
        items.add(0, "Yellow");

        System.out.print("Display list contents with counter-controlled loop:");

        for (int i = 0; i < items.size(); i++) {
            System.out.printf(" %s", items.get(i));
        }
        display(items, "%nDisplay list contents with enhanced for statement: ");

        items.add("Green");
        items.add("Yellow");

        display(items, "List with two new elements: ");

        items.remove("Yellow");
        display(items, "Remove first instance of yellow: ");

        items.remove(1);
        display(items, "Remove second list element (green): ");

        System.out.printf("\"Red\" is %sin the list%n ", items.contains("Red") ? "" : "not");

        System.out.printf("Size list: %s%n", items.size());

    }

    public static void display(List<String> items, String header) {
        System.out.printf(header);

        for (String item : items) {
            System.out.printf("%s ", item);
        }
        System.out.println();
    }
}
