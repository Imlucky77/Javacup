package java8inaction.chapter5;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class FlatMapStreamTest {

    List<String> words = Arrays.asList("Hello", "World");


    List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 9, 8);

    List<Integer> pair1 = Arrays.asList(1, 2, 3);
    List<Integer> pair2 = Arrays.asList(3, 4);




    // don't work because you now end up with a list of streams
    @Test
    public void mapAndArraysStream() {
        words.stream()
                .map(word -> word.split(""))
                .map(Arrays::stream)
                .distinct()
                .collect(toList());

    }

    // Solution
    @Test
    public void FlatMap() {
        List<String> list = words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(toList());

        System.out.println(list);
    }

    @Test
    public void quiz5() {
        List<Integer> squares = number.stream()
                .map(n -> n * n)
                .collect(toList());

        System.out.println(squares);
    }

    @Test
    public void pair() {
        List<int[]> pairs = pair1.stream()
                .flatMap(i -> pair2.stream()
                        .map(j -> new int[]{i, j}))
                .collect(toList());

        System.out.println(pairs);
    }

    @Test
    public void pairThree() {
        List<int[]> list = pair1.stream()
                .flatMap(i -> pair2.stream()
                        .filter(j -> (i + j) % 3 == 0)
                        .map(j -> new int[]{i, j}))
                .collect(toList());

        System.out.println(list);
    }

    @Test
    public void findFirst() {
        Optional<Integer> firstSquareDivisibleByThree = number.stream()
                .map(x -> x * x)
                .filter(x -> x % 3 == 0)
                .findFirst();

        System.out.println(firstSquareDivisibleByThree);
    }

    @Test
    public void sum() {
        Optional<Integer> sum = number.stream()
                .reduce(Integer::sum);

        System.out.println(sum);
    }

    @Test
    public void max() {
        Optional<Integer> max = number.stream()
                .reduce(Integer::max);
                //.reduce(Integer::min);


        System.out.println(max);
    }




}
