package howtoprogram.Chapter08.examples;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birth = new Date(1992, 03, 21);
        Date hire = new Date(1998, 02, 12);

        Employee employee = new Employee("Bob", "Clark", birth, hire);

        System.out.println(employee);
    }
}
