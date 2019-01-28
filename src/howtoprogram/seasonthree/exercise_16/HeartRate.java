package howtoprogram.seasonthree.exercise_16;

import java.util.Calendar;
import java.util.Date;

/**
 * @author imlucky
 * Target-Heart-Rate Calculator
 */
public class HeartRate {

    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;

    public HeartRate(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - year;
    }

    public int getMaxHeartRate() {
        return 220 - getAge();
    }

    public double getTargetHeartRate() {
        return (getMaxHeartRate() * 0.6);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
