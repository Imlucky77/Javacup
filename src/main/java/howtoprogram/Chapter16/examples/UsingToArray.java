package howtoprogram.Chapter16.examples;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author imlucky
 * @Created: 2019/03/16
 * @Examples: Fig. 16.4: UsingToArray.java
 */
public class UsingToArray {
    public static void main(String[] args) {
        String[] colors = {"BLACK", "BLUE", "YELLOW"};
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colors));

        links.addLast("PINK");
        links.add("GREEN");
        links.add(2, "WHITE");
        links.addFirst("CYAN");

        colors = links.toArray(new String[links.size()]);

        System.out.println("colors: ");

        for (String color : colors
        ) {
            System.out.println(color);
        }
    }
}
