package howtoprogram.Chapter05.exercises.exercise_23;

import java.util.Random;

/**
 * @author imlucky
 * @Created: 2019/02/14
 * @Exercise: 5.23
 */
public class DeMorgansLaws {
    public static void main(String[] args) {


        Random random = new Random();
        int a = getNextInt(random);
        int b = getNextInt(random);
        int x = getNextInt(random);
        int y = getNextInt(random);
        int i = getNextInt(random);
        int j = getNextInt(random);
        int g = getNextInt(random);

        System.out.println("RANDOMISED TEST VALUES");
        System.out.printf("a= %d, b= %d, x= %d, y= %d, i= %d, j= %d, g= %d%n",
                a, b, x, y, i, j, g);

        System.out.println("A");
        System.out.printf("!(x < 5) && !(y >= 7) - %s%n",
                getResult(!(x < 5) && !(y >= 7)));
        System.out.printf("!(x < 5) || !(y >= 7) - %s%n",
                getResult(!(x < 5) || !(y >= 7)));

        System.out.println("B");
        System.out.printf("!(a == b) && !(g != 5) - %s%n",
                getResult(!(a == b) && !(g != 5)));
        System.out.printf("!(a == b) || !(g != 5) - %s%n",
                getResult(!(a == b) || !(g != 5)));

        System.out.println("C");
        System.out.printf("!((x <= 8) && (y > 4)) - %s%n",
                getResult(!((x <= 8) && (y > 4))));
        System.out.printf("!((x <= 8) || (y > 4)) - %s%n",
                getResult(!((x <= 8) || (y > 4))));

        System.out.println("D");
        System.out.printf("!((i > 4) && (j <= 6)) - %s%n",
                getResult(!((i > 4) && (j <= 6))));
        System.out.printf("!((i > 4) || (j <= 6)) - %s%n",
                getResult(!((i > 4) || (j <= 6))));

    }

    public static int getNextInt(Random random) {
        return random.nextInt(150);
    }

    public static String getResult(boolean expr) {
        return expr ? "TRUE" : "FALSE";
    }
}
