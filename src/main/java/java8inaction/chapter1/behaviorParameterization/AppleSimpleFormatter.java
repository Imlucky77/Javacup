package java8inaction.chapter1.behaviorParameterization;

import java8inaction.chapter1.Apple;

public class AppleSimpleFormatter implements AppleFormatter {
    public String accept(Apple apple) {
        return "A apple of " + apple.getWeight() + "g";
    }
}
