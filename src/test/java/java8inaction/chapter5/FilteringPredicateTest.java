package java8inaction.chapter5;

import java8inaction.chapter4.Dish;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

public class FilteringPredicateTest {
    List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", true, 530, Dish.Type.OTHER),
            new Dish("rice", true, 350, Dish.Type.OTHER),
            new Dish("season fruit", true, 120, Dish.Type.OTHER),
            new Dish("pizza", true, 550, Dish.Type.OTHER),
            new Dish("prawns", false, 300, Dish.Type.FISH),
            new Dish("salmon", false, 450, Dish.Type.FISH));

    @Test
    public void vegetarian() {
        List<Dish> vegetarianMenu = menu.stream()
                .filter(Dish::isVegetarian)
                .collect(toList());

        System.out.println(vegetarianMenu);
    }

    @Test
    public void calories() {
        menu.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3)
                .forEach(System.out::println);
    }

    @Test
    public void caloriesSkip() {
        menu.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)
                .forEach(System.out::println);
    }

    @Test
    public void quiz5() {
        List<Dish> dishes = menu.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .limit(2)
                .collect(toList());
        System.out.println(dishes);

    }

    @Test
    public void mappingDishes() {
        List<Integer> dishes = menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(toList());

        System.out.println(dishes);
    }

    @Test
    public void count() {
        Optional<Integer> count = menu.stream()
                .map(d -> 1)
                .reduce(Integer::sum);
        System.out.println(count);
    }
}
