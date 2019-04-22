package designpatterns.creational.singletone;

public class SingletoneTest {
    public static void main(String[] args) {

        A instance = A.getInstance();
        System.out.println(instance);

        A instance1 = A.getInstance();
        System.out.println(instance1);
    }
}
