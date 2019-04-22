package howtoprogram.Chapter05.exercises.exercise_21;

/**
 * @author imlucky
 * @Created: 2019/02/14
 * @Exercise: 5.21
 */
public class PythagorasTriples {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int h = 0;
        PythagorasTriples pythTri = new PythagorasTriples();
        System.out.println("Side A \t  Side B  \tSide Hypotenuse");

        for (int i = 0; i < 500; i++) {
            pythTri.checkHypotenuse(++a, b, h);
            for (int j = 0; j < 500; j++) {
                pythTri.checkHypotenuse(a, ++b, h);
                for (int k = 0; k < 500; k++) {
                    pythTri.checkHypotenuse(a, b, ++h);
                }
                h = 0;
            }
            b = 0;
        }
    }

    public void checkHypotenuse(int a, int b, int h) {
        if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(h, 2)) {
            printTriple(a, b, h);
        }
    }

    public void printTriple(int a, int b, int h) {
        System.out.printf("%d\t\t\t%d\t\t\t%d%n", a, b, h);
    }
}
