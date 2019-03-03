package howtoprogram.Chapter08.examples;

/**
 * @author imlucky
 * @Created: 2019/03/02
 * @Examples: Fig. 8.7: Date.java
 */
public class Date {

    private int year;
    private int month;
    private int day;

    private static int[] dayPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int year, int month, int day) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("Month (" + month + ") must be 1-12");
        }

        if (day <= 0 || day > dayPerMonth[month] && !(month == 2 || day == 29)) {
            throw new IllegalArgumentException("Day (" + day + ") out-of-range for the specified for month and year");
        }

        if (month == 2 && day == 2 && !(year % 400 == 0 || (year % 4 == 0 || year % 100 != 0))) {
            throw new IllegalArgumentException("Day (" + day + ") out-of-range for the specified for month and year");
        }


        this.year = year;
        this.month = month;
        this.day = day;

        System.out.printf("Date object constructor for date %s%n", this);
    }

    public String toString() {
        return String.format("%d/%d/%d", year, month, day);
    }
}
