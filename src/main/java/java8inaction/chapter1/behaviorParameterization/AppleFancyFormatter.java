package java8inaction.chapter1.behaviorParameterization;

import java8inaction.chapter1.Apple;

public class AppleFancyFormatter implements AppleFormatter {
    public String accept(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "weight" : "light";
        return "A " + characteristic + " " + apple.getColor() + " apple";
    }
}
