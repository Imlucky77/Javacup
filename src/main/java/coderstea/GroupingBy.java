package coderstea;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class GroupingBy {
    public static void main(String[] args) {

        System.out.println("group into sets");
        List<Integer> list = Arrays.asList(1, 1, 2, 2, 3, 4, 5, 6, 7, 8, 8, 9, 0);
        Map<String, Set<Integer>> oddEvenNumbers = list.stream().collect(Collectors.groupingBy(n -> n % 2 == 0 ? "EVEN" : "ODD", toSet()));
        System.out.println("EVEN numbers " + oddEvenNumbers.get("EVEN"));
        System.out.println("ODD numbers " + oddEvenNumbers.get("ODD"));

        System.out.println("sum the numbers ");
        Map<String, Integer> sumOddOrEvenSquares = list.stream()
                .map(n -> n * n)
                .collect(groupingBy(n -> n % 2 == 0 ? "EVEN" : "ODD",
                        summingInt(Integer::intValue)));
        System.out.println("EVEN numbers " + sumOddOrEvenSquares.get("EVEN"));
        System.out.println("ODD numbers " + sumOddOrEvenSquares.get("ODD"));

        System.out.println("Group Average of the numbers");
        Map<String, Double> averageOfOddEven = list.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "EVEN" : "ODD", Collectors.averagingDouble(Integer::intValue)));
        System.out.println("EVEN numbers " + averageOfOddEven.get("EVEN"));
        System.out.println("ODD numbers " + averageOfOddEven.get("ODD"));

        System.out.println("Group again with some greater than 5");
        Map<String, Map<String, Set<Integer>>> oddEvenAndCompareTo5 = list.stream().
                collect(groupingBy(n -> n % 2 == 0 ? "EVEN" : "ODD", groupingBy(n -> n > 5 ? "GT5" : "LT5", toSet())
                ));

        Map<String, Set<Integer>> evenNumbers = oddEvenAndCompareTo5.get("EVEN");
        Map<String, Set<Integer>> oddNumbers = oddEvenAndCompareTo5.get("ODD");

        System.out.println("Even numbers greater than 5: " + evenNumbers.get("GT5"));
        System.out.println("Odd numbers greater than 5: " + oddNumbers.get("GT5"));
        System.out.println("Even numbers greater than 5: " + evenNumbers.get("LT5"));
        System.out.println("Even numbers greater than 5: " + oddNumbers.get("LT5"));
    }
}
