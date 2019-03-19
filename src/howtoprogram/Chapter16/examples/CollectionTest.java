package howtoprogram.Chapter16.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author imlucky
 * @Created: 2019/03/16
 * @Examples: Fig. 16.2: CollectionTest.java
 */
public class CollectionTest {
    public static void main(String[] args) {
        String[] colors = {"WHITE", "BLACK", "RED", "BLUE", "PINK"};
        List<String> list = new ArrayList<>();

        for (String color : colors) {
            list.add(color);
        }

        String[] removeColors = {"BLACK", "RED", "BLUE"};
        List<String> removeList = new ArrayList<>();

        for (String color : removeColors) {
            removeList.add(color);
        }

        System.out.println("Arrays: ");

        for (int count = 0; count < list.size(); count++) {
            System.out.printf("%s ", list.get(count));
        }

        removeColors(list, removeList);

        System.out.printf("%n%nArrayList after calling removeColors:%n");

        for (String color : list) {
            System.out.printf("%s ", color);
        }
    }

    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {
        Iterator<String> iterator = collection1.iterator();

        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next())) {
                iterator.remove();
            }
        }
    }
}
