package howtoprogram.Chapter03.exercises.exercise_17;

import java.util.Calendar;

public class HealthProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int day;
    private int month;
    private int year;
    private double height;
    private double weight;

    public HealthProfile(String firstName, String lastName, String gender,
                         int day, int month, int year,
                         double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
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

    public double bodyMassIndex() {
        return getWeight() / (getHeight() * getHeight());
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
