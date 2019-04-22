package howtoprogram.Chapter03.exercises.exercise_13;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee james = new Employee("james", "gasling", 3);
        Employee bill = new Employee("bill", "gates", 5);

        double jamesYearlySalary = james.getSalary() * 12;
        double billYearlySalary = bill.getSalary() * 12;


        System.out.println("James's annual salary is: " + jamesYearlySalary);
        System.out.println("bill's annual salary is: " + billYearlySalary);
        System.out.println();

        double jamesRaiseRate = (jamesYearlySalary / 100) * 10;
        System.out.println("james Raise Rate is: " + jamesRaiseRate);
        double billRaiseRate = (billYearlySalary / 100) * 10;
        System.out.println("bill Raise Rate is: " + billRaiseRate);

        double jamesTotalSalary = jamesYearlySalary + jamesRaiseRate;
        double billTotalSalary = billYearlySalary + billRaiseRate;
        System.out.println();

        System.out.println("James's annual salary after 10% raise is: " + jamesTotalSalary);
        System.out.println("bill's annual salary after 10% raise is: " + billTotalSalary);


    }
}
