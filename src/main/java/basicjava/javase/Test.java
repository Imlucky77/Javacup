package basicjava.javase;

public class Test {
    public static void main(String[] args) {
        Animals animals = new Dog();
        //Dog animal = new Animals();
        animals.say();
        animals.move();
        ((Dog) animals).haphap();
        ((Dog) animals).jikjik();
    }
}
