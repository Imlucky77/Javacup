package dastgarmi.D04;

public class Parent extends Utility {
    static int a = a();

    static {
        a = b();
    }

    {
        b = c();
    }

    int b = d();

    public Parent() {
        b = e();
    }

    public static void main(String[] args) {
        Child c1 = new Child();
        System.out.print(" ");
        Child c2 = new Child();
    }
}