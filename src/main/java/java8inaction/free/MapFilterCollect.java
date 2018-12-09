package java8inaction.free;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MapFilterCollect {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        System.out.println("Original list: " + list);

        List<Integer> even = list.stream()
                .map(m -> Integer.valueOf(m))
                .filter(f -> f % 2 == 0)
                .collect(toList());

        System.out.println("processed list, only even numbers: " + even);
    }
}
