package free.test;

public class MainStatic {
    public static void main(String[] args) {
        Car b = new Audi();
        b.run();
        b.hello();

    }

}
    class Car {
        public static void run() {
            System.out.println("car is running");
        }

        public void hello() {
            System.out.println("salam car");
        }
    }

    class Audi extends Car {
        public static void run() {
            System.out.println("Audi is running");
        }

        public void hello() {
            System.out.println("salam audi");
        }
    }