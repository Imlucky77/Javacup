package coderstea;

public class Predicate {
    public static void main(String[] args) {
        java.util.function.Predicate<Integer> isEven = new java.util.function.Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                return number % 2 == 0;
            }
        };

        boolean isNumberEven = isEven.test(23);
        System.out.println(isNumberEven);

        java.util.function.Predicate<Integer> withLambda = (number) -> number % 2 == 0;
        boolean lambda = withLambda.test(46);
        System.out.println(lambda);

        boolean chain = isEven
                .and(n -> n < 10)
                .and(n -> n > 5)
                .test(6);
        System.out.println(chain);
    }
}
