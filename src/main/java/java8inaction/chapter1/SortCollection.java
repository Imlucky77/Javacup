package java8inaction.chapter1;

import java8inaction.chapter1.behaviorParameterization.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortCollection {

    //First attempt: filtering green apples
    public List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }


    //second attempt:  parameterizing the color
    public List<Apple> filterApplesByColor(List<Apple> inventory, String color) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    //Third attempt: filtering with every attribute you can think of
    public List<Apple> filterApples(List<Apple> inventory, String color, int weight, boolean flag) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            if (flag && apple.getColor().equals(color) ||
                    (!flag && apple.getWeight() > weight)) {
                result.add(apple);
            }
        }
        return result;
    }

    //Fourth attempt: filtering by abstract criteria
    public List<Apple> filterApplez(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        for (Apple apple : inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }

    //Seventh attempt: abstracting over List type

    public <T> List<T> filterApplezz(List<T> inventory, TypePredicate<T> typePredicate) {
        List<T> resultType = new ArrayList<>();
        for (T t : inventory) {
            if (typePredicate.test(t)) {
                resultType.add(t);
            }
        }
        return resultType;
    }


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

        SortCollection sortCollection = new SortCollection();
        //First attempt
        System.out.println("First attempt  " + sortCollection.filterGreenApples(appleList));
        //second attempt
        System.out.println("Second attempt " + sortCollection.filterApplesByColor(appleList, "green"));
        System.out.println("Second attempt " + sortCollection.filterApplesByWeight(appleList, 170));
        //Third attempt
        System.out.println("Third attempt " + sortCollection.filterApples(appleList, "green", 120, false));
        //Fourth attempt
        System.out.println("Fourth attempt " + sortCollection.filterApplez(appleList, new AppleGreenColorPredicate()));
        System.out.println("Fourth attempt " + sortCollection.filterApplez(appleList, new AppleHeavyWeightPredicate()));

        //Quiz
        sortCollection.prettyPrintApple(appleList, new AppleFancyFormatter());
        sortCollection.prettyPrintApple(appleList, new AppleSimpleFormatter());

        //Fifth attempt: using an anonymous class
        List<Apple> redApples = sortCollection.filterApplez(appleList, new ApplePredicate() {
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        System.out.println("Fifth attempt: " + redApples);

        //Sixth attempt: using a lambda expression
        List<Apple> LambdaResult = sortCollection.filterApplez(appleList, (Apple apple) -> "green".equals(apple.getColor()));
        System.out.println("Sixth attempt: " + LambdaResult);

        //Seventh attempt: abstracting over List type
        List<Apple> redAppleType = sortCollection.filterApplezz(appleList, (Apple apple) -> "red".equals(apple.getColor()));
        System.out.println("Seventh attempt " + redAppleType);
    }
}