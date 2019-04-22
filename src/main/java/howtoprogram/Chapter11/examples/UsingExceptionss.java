package howtoprogram.Chapter11.examples;

/**
 * @author imlucky
 * @Created: 2019/03/06
 * @Examples: Fig. 11.6: UsingExceptionss.java
 */
public class UsingExceptionss {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception exception) {
            System.err.printf("%s%n%n", exception.getMessage());
            exception.getStackTrace();

            StackTraceElement[] traceElement = exception.getStackTrace();

            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.println("Class\t\t\t\t\t\t\t\t\t\t\t\tFile\t\t\t\t\tLine\tMethod");

            for (StackTraceElement element : traceElement) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());
            }
        }
    }

    public static void method1() throws Exception {
        method2();
    }

    public static void method2() throws Exception {
        method3();
    }

    public static void method3() throws Exception {
        throw new Exception("Exception thrown is method3");
    }

}
