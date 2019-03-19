package howtoprogram.Chapter16.examples;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author imlucky
 * @Created: 2019/03/17
 * @Examples: Fig. 16.3: ListTest.java
 */
public class ListTest {
    public static void main(String[] args) {

        String[] colors1 = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = new LinkedList<>();
        for (String color : colors1) {
            list1.add(color);
        }

        String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list2 = new LinkedList<>();

        for (String color : colors2) {
            list2.add(color);
        }

        list1.addAll(list2);
        list2 = null;
        printList(list1);

        convertToUppercaseSetting(list1);
        printList(list1);

        System.out.printf("%nDeleting elements 4 to 6...");
        removeItems(list1, 4, 7);
        printList(list1);
        printReversedList(list1);
    }

    private static void printList(List<String> list) {
        System.out.printf("%nList:%n");

        for (String color : list) {
            System.out.printf("%s ", color);
        }
        System.out.println();
    }

    private static void convertToUppercaseSetting(List<String> list) {
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()) {
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private static void removeItems(List<String> list, int start, int end) {
        list.subList(start, end).clear();
    }

    private static void printReversedList(List<String> list) {
        ListIterator<String> iterator = list.listIterator(list.size());

        System.out.printf("%nReversed list:%n");
        while (iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous());
        }

    }

}
