package dastgarmi.D10;

public class Initialization2 extends Initialization1 {
    public Initialization2() {
        print(1);
    }

    private int a1 = print(2);
    private static int a2 = print(3);

    {
        print(4);
    }

    static {
        print(5);
    }

    private int b1 = print(6);
    private static int b2 = print(7);

    {
        print(8);
    }

    static {
        print(9);
    }

    private static int print(int number) {
        System.out.print(number);
        return 0;
    }

    public static void main(String[] args) {
        Initialization2 x = new Initialization2();
    }
}
