package howtoprogram.Chapter05.exercises.exercise_31;

/**
 * @author imlucky
 * @Created: 2019/02/16
 * @Exercise: 5.31
 */
public class GlobalWarmingFactsQuizTest {
    public static void main(String[] args) {
        GlobalWarmingFactsQuiz gwfq = new GlobalWarmingFactsQuiz();

        gwfq.startQuiz();
        System.out.printf("Your scored %d/5", gwfq.getScore());

        switch (gwfq.getScore()) {
            case 5:
                System.out.println("\nExcellent\n");
                break;
            case 4:
                System.out.println("\nVery Good\n");
                break;
            default:
                System.out.println("\nTime to brush up on your knowledge of global warming\n");
                System.out.println("You should visit: http://lmgtfy.com/?q=global+warming\n");
                break;
        }
    }
}
