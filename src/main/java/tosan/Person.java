package tosan;

public class Person extends InterviewTest{
    public Person() {
        System.out.println("in cons of Person");
    }

    static {
        System.out.println("in static block of Person");
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
    }
}
