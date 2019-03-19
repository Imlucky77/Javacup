package howtoprogram.Chapter16.examples;

import java.util.*;

/**
 * @author imlucky
 * @Created: 2019/03/17
 * @Examples: Fig. 16.6, 16.7: Sort 1, 2.java
 */
public class SortDemo {
    public static void main(String[] args) {

        String[] suits = {"Silver", "Diamond", "Titanium", "Gold"};
        List<String> list = Arrays.asList(suits);

        System.out.println("Unsorted array elements: " + list);
        //Ascending
        Collections.sort(list);

        System.out.println("Sorted array elements:: " + list);

        //Descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reverse Order for descending: " + list);
    }
}
