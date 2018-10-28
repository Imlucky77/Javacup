package designpatterns.creational.singletone;

public class A {

    //early instantiation
    /*private static A instance = new A();

    private A() {

    }

    public static A getInstance() {
        return instance;
    }*/


    // lazy loading
    private static A instance;

    private A() {

    }

    public static A getInstance() {
        if (instance == null) {
            instance = new A();
        }

        return instance;
    }
}
