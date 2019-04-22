package free.interfaces;

public interface MyInterface {
    public void myInterface();

    default void myInterface(String name) {

    }

    public void sameMethod();

    default void defaultMethod() {
        System.out.println("hello Default Method");
    }
}
