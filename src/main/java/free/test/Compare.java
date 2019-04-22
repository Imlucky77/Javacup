package free.test;

public class Compare {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "hello";


        /*if (s1.equals(s2)) {
            System.output.println("equal");
        } else {
            System.output.println("not equal");
        }*/

        if (s1 == s2) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
