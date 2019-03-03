package howtoprogram.Chapter08.examples;

/**
 * @author imlucky
 * @Created: 2019/03/02
 * @Examples: Fig. 8.8: Employee.java
 */
public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public String toString() {
        return String.format("%s, %s Hired: %s Birthday: %s",
                firstName, lastName, hireDate, birthDate);
    }
}
