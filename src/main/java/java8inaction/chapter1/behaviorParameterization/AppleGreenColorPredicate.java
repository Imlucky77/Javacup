package java8inaction.chapter1.behaviorParameterization;

import java8inaction.chapter1.Apple;

public class AppleGreenColorPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        //return apple.getColor().equals("green");
        return "green".equals(apple.getColor());
    }
}
