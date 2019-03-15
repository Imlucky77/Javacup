package howtoprogram.Chapter09.examples;

/**
 * @author imlucky
 * @Created: 2019/03/03
 * @Examples: Fig. 9.5, 9.7: CommissionEmployeeTest.java
 */
public class CommissionEmployeeTest {
    public static void main(String[] args) {
        CommissionEmployee employee = new CommissionEmployee(
                "Sue", "Jones", "222-22-222",
                10000, .6
        );

        System.out.println(
                "Employee information obtained by get methods:");

        System.out.printf("%n%s %s%n", "First name is", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is", employee.getCommissionRate());
        //System.output.printf("%s %.2f%n", "Base salary is", employee.getBaseSalary());

        employee.setGrossSales(5000);
        employee.setCommissionRate(.1);
        //employee.setBaseSalary(1000);

        System.out.printf("%n%s:%n%n%s%n",
                "Updated employee information obtained by toString", employee.toString());
    }
}
