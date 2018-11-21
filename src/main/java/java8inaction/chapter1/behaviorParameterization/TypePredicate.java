package java8inaction.chapter1.behaviorParameterization;

public interface TypePredicate<T> {
    boolean test(T t);
}
