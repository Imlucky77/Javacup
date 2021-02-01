package coderstea;

import java.util.function.BinaryOperator;

public class BiFunction {
    public static void main(String[] args) {
        java.util.function.BiFunction<Integer, Integer, Integer> areaOfRectangle = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer height, Integer width) {
                return height * width;
            }
        };

        Integer applyBiFunction = areaOfRectangle.apply(3, 2);
        System.out.println(applyBiFunction);

        java.util.function.BiFunction<Integer, Integer, Integer> areaOfRectangleLambda = (height, width) -> height * width;
        Integer applyLambda = areaOfRectangleLambda.apply(4, 3);
        System.out.println(applyLambda);

        Integer apply = areaOfRectangle
                .andThen(area -> area * 3)
                .apply(2, 3);
        System.out.println(apply);
    }
}
