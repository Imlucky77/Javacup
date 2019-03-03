package howtoprogram.Chapter08.examples;

/**
 * @author imlucky
 * @Created: 2019/03/02
 * @Examples: Fig. 8.13: EmployeeStaticsTest.java
 */
public class EmployeeStaticsTest {
    public static void main(String[] args) {
        System.out.printf("Employees before instantiation: %d%n",
                EmployeeStatics.getCount());

        EmployeeStatics e1 = new EmployeeStatics("Susan", "Baker");
        EmployeeStatics e2 = new EmployeeStatics("Bob", "Blue");
        System.out.printf("%nEmployees after instantiation:%n");

        System.out.printf("via e1.getCount(): %d%n", e1.getCount());
        System.out.printf("via e2.getCount(): %d%n", e2.getCount());
        System.out.printf("via Employee.getCount(): %d%n",
                EmployeeStatics.getCount());

        System.out.printf("%nEmployee 1: %s %s%nEmployee 2: %s %s%n",
                e1.getFirstName(), e1.getLastName(),
                e2.getFirstName(), e2.getLastName());
    }
}
