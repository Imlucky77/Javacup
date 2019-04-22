package howtoprogram.Chapter08.examples;

/**
 * @author imlucky
 * @Created: 2019/03/02
 * @Examples: Fig. 8.2: Time1Test.java
 */
public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();

        displayTime("After time Object is created", time);
        System.out.println();

        time.setTime(13, 27, 6);
        displayTime("After calling setTime", time);
        System.out.println();

        try {
            time.setTime(90, 90, 90);
        } catch (IllegalArgumentException e) {
            System.out.printf("Exception %s%n%n", e.getMessage());
        }
        displayTime("After calling setTime with invalid values", time);
    }

    public static void displayTime(String header, Time1 t) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                header, t.toUniversalString(), t.toString());
    }
}
