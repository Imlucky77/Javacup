package designpatterns.creational.singletone;

public class MySingletone {

    private static MySingletone singletone;

    private MySingletone() {
    }

    public void sayHello() {
        System.out.println("salam ali");
    }

    public static MySingletone getInstance() {
        if (singletone == null) {
            singletone = new MySingletone();
        }
        return singletone;
    }

    public static void main(String[] args) {
        MySingletone instance = MySingletone.getInstance();
        instance.sayHello();
    }
}
