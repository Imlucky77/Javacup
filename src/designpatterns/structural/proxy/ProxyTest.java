package designpatterns.structural.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("CodeGate.jpg");

        //image will be loaded from disk
        // first call method display from RealImage class
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        // for run again not call display method from RealImage class
        image.display();
    }
}
