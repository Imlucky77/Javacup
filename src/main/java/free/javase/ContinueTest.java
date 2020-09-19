package free.javase;

public class ContinueTest {
    public static void main(String[] args) {

        /*for (int i = 0; i < 10; i++) {
            if (i == 7) {
                continue;
            }
            System.out.println(i + " ");
        }*/

        int counter = 10;
        while (counter >= 0) {
            if (counter == 5) {
                counter--;
                continue;
            }
            System.out.println(counter + " ");
            counter--;
        }
    }
}
