package howtoprogram.Chapter06.exercises.exercise_15;

/**
 * @author imlucky
 * @Created: 2019/02/18
 * @Exercise: 6.15
 */
public class HypotenuseCalculations {
    public static void main(String[] args) {
        System.out.println("TRIANGLE ONE");
        System.out.printf("side1: %.2f\tside2: %.2f\thypotenuse: %.2f%n",
                3.0, 4.0, hypotenuse(3.0, 4.0));
        System.out.println("TRIANGLE TWO");
        System.out.printf("side1: %.2f\tside2: %.2f\thypotenuse: %.2f%n",
                5.0, 12.0, hypotenuse(5.0, 12.0));
        System.out.println("TRIANGLE THREE");
        System.out.printf("side1: %.2f\tside2: %.2f\thypotenuse: %.2f%n",
                8.0, 15.0, hypotenuse(8.0, 15.0));
    }

    public static double hypotenuse(double side1, double side2) {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }
}
