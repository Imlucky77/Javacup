package coderstea;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class PartitioningBy {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9
        );

        Map<Boolean, List<Integer>> collect = intList.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println("The Even numbers are: " + collect.get(true));

        Map<Boolean, List<Integer>> get5Map = intList.stream()
                .collect(Collectors.partitioningBy(num -> num >= 5));
        System.out.println("The numbers that Greater than and equal with 5 are: " + get5Map.get(true));
        System.out.println("The numbers that Less than 5 are: " + get5Map.get(false));

        Map<Boolean, Double> averageNumbers = intList.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 != 0, Collectors.averagingInt(Integer::intValue)));
        System.out.println("The Odd numbers average are: " + averageNumbers.get(true));
        System.out.println("The even numbers average are: " + averageNumbers.get(false));

        Map<Boolean, Set<Integer>> setNumbers = intList.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 != 0, Collectors.toSet()));
        System.out.println(setNumbers);

        Map<Boolean, Map<Boolean, List<Integer>>> get5OddEvenMap = intList.stream()
                .collect(Collectors.partitioningBy(num -> num >= 5,
                        Collectors.partitioningBy(num -> num % 2 == 0)));
        System.out.println("Odd numbers Greater than 5 are: " + get5OddEvenMap.get(true).get(false));
        System.out.println("Even numbers Greater than 5 are: " + get5OddEvenMap.get(true).get(true));
        System.out.println("Even numbers Less than 5 are: " + get5OddEvenMap.get(false).get(true));

    }
}
