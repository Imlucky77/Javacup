package basicjava.inheritence;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("animal", 1, 1, 5, 6);
        Dog dog = new Dog("yorkie", 2, 43, 4, 6, 6, 7, 8, 9, 0);

        dog.eat();
        dog.walk();
        dog.run();


        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelarate(30);
        outlander.accelarate(20);
        outlander.accelarate(-42);
    }
}
