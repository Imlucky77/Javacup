package designpatterns.creational.singletone;

public class MySingleton {

    private static MySingleton singleton;

    private MySingleton() {
    }

    public void sayHello() {
        System.out.println("salam ali");
    }

    public static MySingleton getInstance() {
        if (singleton == null) {
            singleton = new MySingleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        MySingleton instance = MySingleton.getInstance();
        instance.sayHello();
    }
}
