package howtoprogram.Chapter05.exercises.exercise_29;

/**
 * @author imlucky
 * @Created: 2019/02/16
 * @Exercise: 5.29
 */
public class TheTwelveDaysOfChristmas {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.print("\nOn the ");
            switch (i) {
                case 1:
                    System.out.print("First ");
                    break;
                case 2:
                    System.out.print("Second ");
                    break;
                case 3:
                    System.out.print("Third ");
                    break;
                case 4:
                    System.out.print("Fourth ");
                    break;
                case 5:
                    System.out.print("Fifth ");
                    break;
                case 6:
                    System.out.print("Sixth ");
                    break;
                case 7:
                    System.out.print("Seventh ");
                    break;
                case 8:
                    System.out.print("Eighth ");
                    break;
                case 9:
                    System.out.print("Ninth ");
                    break;
                case 10:
                    System.out.print("Tenth ");
                    break;
                case 11:
                    System.out.print("Eleventh ");
                    break;
                case 12:
                    System.out.print("Twelfth ");
                    break;
                default:
                    break;
            }
            System.out.print("day of christmas my true love sent to me:\n");

            switch (i) {
                case 12:
                    System.out.print("12 Drummers Drumming\n");
                case 11:
                    System.out.print("11 Pipers Piping\n");
                case 10:
                    System.out.print("10 Lords a-Leaping\n");
                case 9:
                    System.out.print("9 Ladies Dancing\n");
                case 8:
                    System.out.print("8 Maids a-Milking\n");
                case 7:
                    System.out.print("7 Swans a-Swimming\n");
                case 6:
                    System.out.print("6 Geese a-Laying\n");
                case 5:
                    System.out.print("5 Gold Rings\n");
                case 4:
                    System.out.print("4 Calling Birds\n");
                case 3:
                    System.out.print("3 French Hens\n");
                case 2:
                    System.out.print("2 Turtle Doves\n");
                case 1:
                    if (i > 1) {
                        System.out.print((i < 12) ? "and\n" : "aaaaaand\n");
                    }
                    System.out.println("A Partridge in a Pear Tree\n");
            }
        }
    }
}
