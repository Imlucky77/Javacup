package howtoprogram.Chapter08.examples;

import static java.lang.Math.*;
import static java.lang.System.*;


/**
 * @author imlucky
 * @Created: 2019/03/02
 * @Examples: Fig. 8.14: StaticImportTest.java
 */
public class StaticImportTest {
    public static void main(String[] args) {
        out.printf("sqrt(900.0) = %.1f%n", sqrt(900.0));
        out.printf("ceil(-9.8) = %.1f%n", ceil(-9.8));
        out.printf("E = %f%n", E);
        out.printf("PI = %f%n", PI);
    }
}
