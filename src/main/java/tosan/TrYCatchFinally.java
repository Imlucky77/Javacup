package tosan;

public class TrYCatchFinally {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
            System.out.println("ok " + a);
        } catch (Exception e) {
            System.out.println("error");
        } finally {
            System.out.println("dalliiiiiiiiiiiiiii");
        }
    }
}
