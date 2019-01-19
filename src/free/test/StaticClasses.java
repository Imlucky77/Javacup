package free.test;

public class StaticClasses {
    public static String hotDrink = "hot chocolate";

    public static void main(String[] args) {
        StaticClasses.run scr = new StaticClasses.run();
        scr.display();
    }

    public static class run {
        public void display() {
            System.out.println("drink is: " + hotDrink);
        }
    }

}
