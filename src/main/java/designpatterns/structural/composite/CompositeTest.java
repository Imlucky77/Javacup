package designpatterns.structural.composite;

public class CompositeTest {
    public static void main(String[] args) {

        Employee ceo = new Employee("Ali dabagh", "Manager", 5000);


        Employee headSales = new Employee("behnam", "developer", 1001);
        Employee headMarketing = new Employee("habib", "marketing", 1002);

        Employee clerk1 = new Employee("vahid", "marketing", 1003);
        Employee clerk2 = new Employee("saeed", "marketing", 1004);

        Employee saleExecutive1 = new Employee("mohammad", "sale", 1005);
        Employee saleExecutive2 = new Employee("reza", "sale", 1006);


        ceo.add(headSales);
        ceo.add(headMarketing);

        headSales.add(saleExecutive1);
        headSales.add(saleExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(ceo);

        for (Employee headEmployee : ceo.getSubordinates()) {
            System.out.println(headEmployee);


            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
