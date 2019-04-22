package howtoprogram.Chapter16.examples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author imlucky
 * @Created: 2019/03/17
 * @Examples: Fig. 16.11: Algorithm1.java
 */
public class Algorithm1 {
    public static void main(String[] args) {
        Character[] letters = {'P', 'C', 'M'};
        List<Character> list = Arrays.asList(letters);
        output(list);

        Collections.reverse(list);
        System.out.printf("%nAfter calling reverse, list contains:%n");
        output(list);

        Character[] lettersCopy = new Character[3];
        List<Character> copyList = Arrays.asList(lettersCopy);

        Collections.copy(copyList, list);
        System.out.printf("%nAfter copying, copyList contains:%n", copyList);
        output(list);

        Collections.fill(list, 'R');
        System.out.printf("%nAfter calling fill, list contains:%n");
        output(list);
    }

    public static void output(List<Character> listRef) {
        System.out.print("The list is: ");

        for (Character c : listRef) {
            System.out.printf("%s ", c);
        }

        System.out.printf("%nMax: %s", Collections.max(listRef));
        System.out.printf(" Min: %s%n", Collections.min(listRef));
    }
}
