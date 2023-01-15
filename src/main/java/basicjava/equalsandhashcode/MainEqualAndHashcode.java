package basicjava.equalsandhashcode;

import java.util.HashSet;
import java.util.Set;

public class MainEqualAndHashcode {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee1 = new Employee();

        employee.setId(100);
        employee1.setId(100);

        System.out.println(employee.equals(employee1));

        Set<Employee> employees = new HashSet<>();

        employees.add(employee);
        employees.add(employee1);

        System.out.println(employees);
    }
}
