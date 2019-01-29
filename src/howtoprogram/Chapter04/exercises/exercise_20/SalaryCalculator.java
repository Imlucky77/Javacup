package howtoprogram.Chapter04.exercises.exercise_20;

/**
 * @author imlucky
 * @Created: 2019/01/29
 * @Exercise: 4.20
 */
public class SalaryCalculator {
    private double overTimeRate = 1.5;

    private double hours;
    private double pay;

    public void setHours(double hours) {
        this.hours = hours;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double calculateGrossPay() {
        double baseHours = 40.0;
        return hours > 40 ? (pay * baseHours) + ((pay * overTimeRate) * (hours - baseHours)) : hours * pay;
    }
}
