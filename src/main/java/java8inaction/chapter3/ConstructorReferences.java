package java8inaction.chapter3;

import java8inaction.chapter1.Apple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferences {
    public static void main(String[] args) {

        // zero-argument constructor
        Supplier<Apple> appleSupplier = Apple::new;
        Apple apple = appleSupplier.get();
        System.out.println(apple);

        Supplier<Apple> appleSupplierLambda = () -> new Apple();
        Apple appleLambda = appleSupplierLambda.get();
        System.out.println(appleLambda);

        // constructor with signature
        Function<Integer, Apple> appleFunction = Apple::new;
        Apple function = appleFunction.apply(150);
        System.out.println(function);

        Function<Integer, Apple> appleFunctionLambda = (Integer weight) -> new Apple(weight);
        Apple functionLambda = appleFunctionLambda.apply(150);
        System.out.println(functionLambda);

        // two-argument constructor
        BiFunction<String, Integer, Apple> appleBiFunction = Apple::new;
        Apple biFunction = appleBiFunction.apply("green", 150);
        System.out.println(biFunction);

        BiFunction<String, Integer, Apple> appleBiFunctionLambda = (color, weight) -> new Apple(color, weight);
        Apple biFunctionLambda = appleBiFunctionLambda.apply("green", 150);
        System.out.println(biFunctionLambda);

        List<Integer> weight = Arrays.asList(1, 58, 8, 7);
        List<Apple> apples = map(weight, Apple::new);
    }

    public static List<Apple> map(List<Integer> list, Function<Integer, Apple> function) {
        List<Apple> result = new ArrayList<>();

        for (Integer a : list) {
            result.add(function.apply(a));
        }
        return result;
    }
}
