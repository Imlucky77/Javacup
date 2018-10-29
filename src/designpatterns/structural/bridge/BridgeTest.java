package designpatterns.structural.bridge;

public class BridgeTest {
    public static void main(String[] args) {

        Shape redCircle = new Circle(new RedCircle(), 100, 10, 10);

        Shape greenCircle = new Circle(new GreenCircle(), 200, 20, 20);

        redCircle.draw();
        greenCircle.draw();
    }
}
