package dastgarmi.D01;

public class Program {
    private static Integer i = 66;

    {
        char newCh = (char) (--i).intValue();
    }

    public static void main(String[] args) {
        method();
    }

    static void method() {
        Program t1, t2;
        Long l1 = i.longValue(), l2 = l1++;
        t1 = new Program();
        System.out.print(l1 - Program.i);
        t2 = new Program();
        System.out.print(l2 - Program.i);
    }

}
