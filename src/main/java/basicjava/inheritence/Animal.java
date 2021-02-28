package basicjava.inheritence;

public class Animal {
    private String name;
    private int size;
    private int body;
    private int weight;
    private int brain;

    public Animal(String name, int size, int body, int weight, int brain) {
        this.name = name;
        this.size = size;
        this.body = body;
        this.weight = weight;
        this.brain = brain;
    }

    public void eat() {
        System.out.println("Animal eat called()");
    }

    public void move(int speed) {
        System.out.println("animal move called. animal is moving at " + speed);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getBody() {
        return body;
    }

    public int getWeight() {
        return weight;
    }

    public int getBrain() {
        return brain;
    }
}
