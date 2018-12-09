package java8inaction.chapter5;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FilteringUniqueTest {
    List<Integer> unique = Arrays.asList(
            1, 2, 2, 3, 6, 5, 8, 5, 9, 7, 4
    );

    @Test
    public void filteringUnique() {
        unique.stream()
                .filter(
                        i -> i % 2 == 0
                )
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

}
