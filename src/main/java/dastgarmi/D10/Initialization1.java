package dastgarmi.D10;

class Initialization1 {
    public Initialization1() {
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
}
