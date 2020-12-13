package dastgarmi.D08;

public class Swap {
    public static void swap(String a, String b) {
        String temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        String x = "Naser";
        String y = "Nader";
        swap(x, y);
        System.out.println(x + "," + y);
    }
}
