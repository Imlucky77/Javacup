package designpatterns.creational.abstractfactory;

public class Main {

    public static void main(String[] args) {

        AbstractFactory abstractFactoryShape = FactoryProducer.getFactory("shape");

        Shape circle = abstractFactoryShape.getShape("circle");
        circle.draw();

        Shape rectangle = abstractFactoryShape.getShape("rectangle");
        rectangle.draw();

        Shape square = abstractFactoryShape.getShape("square");
        square.draw();


        AbstractFactory abstractFactoryColor = FactoryProducer.getFactory("color");

        Color red = abstractFactoryColor.getColor("red");
        red.fill();

        Color green = abstractFactoryColor.getColor("green");
        green.fill();

        Color blue = abstractFactoryColor.getColor("blue");
        blue.fill();

    }
}
