package howtoprogram.Chapter05.examples;

public class DoWhileTest {
    public static void main(String[] args) {
        int counter = 1;

        do {
            System.out.printf("%d ", counter);
            ++counter;
        } while (counter <= 10);
    }
}
