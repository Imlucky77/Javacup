package basicjava.inheritence;

public class Dog extends Animal {
    private int tail;
    private int leg;
    private int eyes;
    private int teeth;
    private int coat;

    public Dog(String name, int size, int body, int weight, int brain, int tail, int leg, int eyes, int teeth, int coat) {
        super(name, size, body, weight, brain);
        this.tail = tail;
        this.leg = leg;
        this.eyes = eyes;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew() {
        System.out.println("dog chew called");
    }

    @Override
    public void eat() {
        System.out.println("dog eat called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("dog walk called");
        move(5);
    }

    public void run() {
        System.out.println("dog run called");
        move(10);
        test();
    }

    public static void test() {
        System.out.println("for test");
    }
}
