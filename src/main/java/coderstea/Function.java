package coderstea;

public class Function {
    public static void main(String[] args) {
        java.util.function.Function<Integer, Integer> doubleNumber = new java.util.function.Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer number) {
                return number * 2;
            }
        };

        Integer applyFunction = doubleNumber.apply(10);
        System.out.println(applyFunction);

        java.util.function.Function<Integer, Integer> lambdaFunction = (number) -> number - 2;
        Integer applyLambda = lambdaFunction.apply(16);
        System.out.println(applyLambda);

        Integer applyChain = doubleNumber
                .andThen(lambdaFunction)
                .andThen(doubleNumber)
                .apply(4);

        System.out.println(applyChain);
    }
}
