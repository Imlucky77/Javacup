package howtoprogram.Chapter11.examples;

/**
 * @author imlucky
 * @Created: 2019/03/06
 * @Examples: Fig. 11.7: UsingChainedExceptions.java
 */
public class UsingChainedExceptions {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void method1() throws Exception {
        try {
            method2();
        } catch (Exception exception) {
            throw new Exception("Exception thrown is method1", exception);
        }
    }

    public static void method2() throws Exception {

        try {
            method3();
        } catch (Exception exception) {
            throw new Exception("Exception thrown is method2", exception);
        }
    }

    public static void method3() throws Exception {
        throw new Exception("Exception thrown is method3");
    }
}
