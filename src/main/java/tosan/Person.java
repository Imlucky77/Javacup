package tosan;

import basicjava.inheritence.Outlander;

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

        Outlander outlander = new Outlander(10);
        Class<? extends Outlander> aClass = outlander.getClass();
        System.out.println(aClass);
    }
}
