package howtoprogram.Chapter16.examples;

import howtoprogram.Chapter08.examples.Time1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author imlucky
 * @Created: 2019/03/17
 * @Examples: Fig. 16.9: SortDemo2.java
 */
public class SortDemo2 {
    public static void main(String[] args) {

        List<Time1> list = new ArrayList<>();

        list.add(new Time1(6, 24, 22));
        list.add(new Time1(17, 3, 8));
        list.add(new Time1(6, 14, 37));
        list.add(new Time1(12, 35, 19));
        list.add(new Time1(6, 24, 56));

        System.out.println("Unsorted array elements: " + list);
        Collections.sort(list, new TimeComparator());
        System.out.println("Sorted list elements: " + list);
    }
}
