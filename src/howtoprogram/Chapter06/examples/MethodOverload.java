package howtoprogram.Chapter06.examples;

/**
 * @author imlucky
 * @Created: 2019/02/17
 * @Examples: Fig. 6.10: MethodOverload.java
 */
public class MethodOverload {

    public static void main(String[] args) {
        System.out.println("Square of integer 7 is: " + square(7));
        System.out.println("Square of double 7 is: " + square(7.5));
    }


    public static int square(int intValue) {
        System.out.println("Called square with int argument: " + intValue);
        return intValue * intValue;
    }

    public static double square(double doubleValue) {
        System.out.println("Called square with int argument: " + doubleValue);
        return doubleValue * doubleValue;
    }
}
