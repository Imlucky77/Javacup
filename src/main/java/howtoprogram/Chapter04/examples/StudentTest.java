package howtoprogram.Chapter04.examples;

public class StudentTest {
    public static void main(String[] args) {

        Student jane = new Student("Jane green", 92);
        Student john = new Student("John blue", 71);

        System.out.println(jane.getName() + " " + jane.getLetterGrade());
        System.out.println(john.getName() + " " + john.getLetterGrade());


    }
}
