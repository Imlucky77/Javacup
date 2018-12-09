package java8inaction.chapter6;

import java8inaction.chapter4.Dish;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class ReducingAndSummarizing {

    public static void main(String[] args) {
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

        long howManyDishes = menu.stream().count();
        //.collect(Collectors.counting());
        System.out.println(howManyDishes);


        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);

        Optional<Dish> mostCalorieDish = menu.stream() //collect(maxBy(dishCaloriesComparator));
                .max(dishCaloriesComparator);

        System.out.println(mostCalorieDish);

        IntSummaryStatistics totalCalories = menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        //collect(Collectors.averagingInt(Dish::getCalories));
        //mapToInt(Dish::getCalories).sum();
        // collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(totalCalories);


        String shortMenu = menu.stream().map(Dish::getName).collect(joining(","));
        System.out.println(shortMenu);

        Integer collect = menu.stream().map(Dish::getCalories).reduce(0, (i, j) -> i + j); //collect(reducing(0, Dish::getCalories, (i, j) -> i + j))
        System.out.println(collect);


        Optional<Dish> intTotal = menu.stream().reduce((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2); //collect(reducing((d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2))
        System.out.println(intTotal);

        Map<Dish.Type, List<Dish>> dishesByType = menu.stream().collect(groupingBy(Dish::getType));
        System.out.println(dishesByType);

        Map<Dish.CaloricLevel, List<Dish>> dishesByCaloricLevel = menu.stream().collect(
                groupingBy(dish -> {
                            if (dish.getCalories() <= 400) {
                                return Dish.CaloricLevel.DIET;
                            } else if (dish.getCalories() <= 700) {
                                return Dish.CaloricLevel.NORMAL;
                            } else {
                                return Dish.CaloricLevel.FAT;
                            }
                        }
                )
        );
        System.out.println(dishesByCaloricLevel);


        // multiLevel grouping
        Map<Dish.Type, Map<Dish.CaloricLevel, List<Dish>>> dishesByTypeAndCalorics = menu.stream().collect(groupingBy(Dish::getType, groupingBy(dish -> {
            if (dish.getCalories() <= 400) {
                return Dish.CaloricLevel.DIET;
            } else if (dish.getCalories() <= 700) {
                return Dish.CaloricLevel.NORMAL;
            } else {
                return Dish.CaloricLevel.FAT;
            }
        })));
        System.out.println(dishesByTypeAndCalorics);


        Map<Dish.Type, Long> typesCount = menu.stream().collect(groupingBy(Dish::getType, counting()));
        System.out.println(typesCount);


        Map<Dish.Type, Optional<Dish>> mostCaloricByType = menu.stream().collect(groupingBy(Dish::getType, maxBy(comparing(Dish::getCalories))));
        System.out.println(mostCaloricByType);

        Map<Dish.Type, Dish> mostCaloricByTypeAndThen = menu.stream().collect(groupingBy(Dish::getType,
                collectingAndThen(maxBy(comparingInt(Dish::getCalories)), Optional::get)));
        System.out.println(mostCaloricByTypeAndThen);

        Map<Dish.Type, Integer> totalCaloriesByType = menu.stream().collect(groupingBy(Dish::getType, summingInt(Dish::getCalories)));
        System.out.println(totalCaloriesByType);


        Map<Dish.Type, Set<Dish.CaloricLevel>> caloricLevelsByType = menu.stream().collect(groupingBy(Dish::getType, mapping(
                dish -> {
                    if (dish.getCalories() <= 400) {
                        return Dish.CaloricLevel.DIET;
                    } else if (dish.getCalories() <= 700) {
                        return Dish.CaloricLevel.NORMAL;
                    } else {
                        return Dish.CaloricLevel.FAT;
                    }
                }, toCollection(HashSet::new) //toSet()
        )));
        System.out.println(caloricLevelsByType);

        Map<Boolean, List<Dish>> partitionedMenu = menu.stream().collect(partitioningBy(Dish::isVegetarian));
        System.out.println(partitionedMenu);

        List<Dish> dishesTrue = partitionedMenu.get(true);
        System.out.println(dishesTrue);

        List<Dish> vegetarianDishes = menu.stream().filter(Dish::isVegetarian).collect(toList());
        System.out.println(vegetarianDishes);

        Map<Boolean, Map<Dish.Type, List<Dish>>> vegetarianDishesByType = menu.stream().collect(partitioningBy(Dish::isVegetarian, groupingBy(Dish::getType)));
        System.out.println(vegetarianDishesByType);


        Map<Boolean, Dish> mostCaloricPartitionedByVegetarian = menu.stream().collect(partitioningBy(Dish::isVegetarian, collectingAndThen(maxBy(comparingInt(Dish::getCalories)), Optional::get)));
        System.out.println(mostCaloricPartitionedByVegetarian);

    }
}
