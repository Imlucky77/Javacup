package java8inaction.chapter3;

import java.sql.SQLOutput;
import java.util.function.Function;

public class ComposingFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> a = x -> x + 1;
        Function<Integer, Integer> b = x -> x * 2;
        Function<Integer, Integer> c = a.andThen(b);

        int resultAndThen = c.apply(5);
        System.out.println(resultAndThen);

        Function<Integer, Integer> d = x -> x + 1;
        Function<Integer, Integer> e = x -> x * 2;
        Function<Integer, Integer> f = d.compose(e);

        int resultCompose = f.apply(3);
        System.out.println(resultCompose);
    }
}
