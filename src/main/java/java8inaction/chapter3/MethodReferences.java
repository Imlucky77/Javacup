package java8inaction.chapter3;

import java8inaction.chapter1.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class MethodReferences {
    public static void main(String[] args) {
        List<Apple> appleList = Arrays.asList(
                new Apple("green", 120),
                new Apple("red", 130),
                new Apple("yellow", 140),
                new Apple("green", 150),
                new Apple("red", 170),
                new Apple("green", 210),
                new Apple("black", 236)
        );

        appleList.sort(comparing(Apple::getWeight));
        System.out.println(appleList);


        List<String> str = Arrays.asList("a", "b", "A", "B");
        //str.sort((s1, s2)-> s1.compareToIgnoreCase(s2));
        str.sort(String::compareToIgnoreCase);
        System.out.println(str);
    }
}
