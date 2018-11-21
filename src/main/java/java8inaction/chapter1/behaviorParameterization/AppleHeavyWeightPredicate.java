package java8inaction.chapter1.behaviorParameterization;

import java8inaction.chapter1.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate {
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
