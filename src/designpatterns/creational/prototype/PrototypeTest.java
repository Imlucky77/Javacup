package designpatterns.creational.prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        EmployeeRecord e1 = new EmployeeRecord(1, "java", "programmer", 1_500_000, "Tehran");
        e1.showRecord();

        EmployeeRecord e2 = (EmployeeRecord) e1.clone();
        e2.showRecord();
    }
}
