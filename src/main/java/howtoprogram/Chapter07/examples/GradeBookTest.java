package howtoprogram.Chapter07.examples;

/**
 * @author imlucky
 * @Created: 2019/02/27
 * @Examples: Fig. 7.15: GradeBookTest.java
 */
public class GradeBookTest {
    public static void main(String[] args) {
        int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

        GradeBook gradeBook = new GradeBook(
                "CS101 Introduction to Java Programming", gradesArray);

        System.out.printf("Welcome to the grade book for%n%s%n%n", gradeBook.getCourseName());
        gradeBook.processGrade();
    }
}
