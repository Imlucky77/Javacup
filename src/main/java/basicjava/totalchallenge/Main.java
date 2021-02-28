package basicjava.totalchallenge;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("basic", "sausage", 3.56, "white");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("cheese", 1.13);

        System.out.println("Total burger price is " + hamburger.itemizeHamburger());

        HealthyHamburger healthy = new HealthyHamburger("Bacon", 5.67);
        healthy.addHamburgerAddition1("Egg", 5.43);
        healthy.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total healthy burger price is " + healthy.itemizeHamburger());


        DeluxeBurger burger = new DeluxeBurger();
        burger.addHamburgerAddition3("Should not do this", 50.53);
        burger.itemizeHamburger();
    }
}
