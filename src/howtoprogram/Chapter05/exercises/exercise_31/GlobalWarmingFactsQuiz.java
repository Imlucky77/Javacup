package howtoprogram.Chapter05.exercises.exercise_31;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GlobalWarmingFactsQuiz {
    private static int NUM_QUESTION = 5;

    private Scanner input = new Scanner(System.in);
    private ArrayList<String> questionList = new ArrayList<>();
    private ArrayList<String> answerList = new ArrayList<>();
    private ArrayList<ArrayList<String>> answerPool = new ArrayList<>();
    private Random random = new Random();

    private int[] questionNum = new int[5];
    private int score = 0;

    public GlobalWarmingFactsQuiz() {
        setQuestions();
    }

    private void setQuestions() {
        ArrayList<Integer> list = new ArrayList<>(NUM_QUESTION);
        for (int i = 1; i <= NUM_QUESTION; i++) {
            list.add(i);
        }

        int q = 0;
        while (list.size() > 0) {
            int index = random.nextInt(list.size());
            questionNum[q++] = list.remove(index);
        }

        for (int i = 0; i < questionNum.length; i++) {
            switch (questionNum[i]) {
                case 1:
                    questionList.add("Question 1");
                    answerPool.add(getAnswers("Answer 1"));
                    break;
                case 2:
                    questionList.add("Question 2");
                    answerPool.add(getAnswers("Answer 2"));
                    break;
                case 3:
                    questionList.add("Question 3");
                    answerPool.add(getAnswers("Answer 3"));
                    break;
                case 4:
                    questionList.add("Question 4");
                    answerPool.add(getAnswers("Answer 4"));
                    break;
                case 5:
                    questionList.add("Question 5");
                    answerPool.add(getAnswers("Answer 5"));
                    break;
                default:
                    break;
            }
        }
    }

    public ArrayList<String> getAnswers(String correct) {
        ArrayList<String> tempList = new ArrayList<>();
        ArrayList<String> returnList = new ArrayList<>();

        answerList.add(correct);
        tempList.add(correct);
        tempList.add("wrong");
        tempList.add("not this one");
        tempList.add("nope");
        tempList.add("maybe this one");
        while (tempList.size() > 0) {
            int index = random.nextInt(tempList.size());
            returnList.add(tempList.remove(index));
        }
        return returnList;
    }

    public void startQuiz() {
        System.out.println("Welcome to the Global Warming quiz.");
        System.out.println("You will be graded on 5 multiple choice questions.\n");

        for (int q = 0; q < NUM_QUESTION; q++) {
            System.out.printf("Question %d: %s%n%n", q + 1, questionList.get(q));
            for (int a = 0; a < 5; a++) {
                System.out.printf("%d: %s%n", a + 1, answerPool.get(q).get(a));
            }

            int c = requestInput("\nYour Answer: ");

            if (isCorrect(q, c - 1, answerPool.get(q).get(c - 1))) {
                System.out.println("Correct\n");
                score++;
            } else {
                System.out.printf("Incorrect%nThe correct answer is: %s%n%n", getAnswer(q));
            }
        }
    }

    // check for correct answer
    private boolean isCorrect(int q, int choice, String a) {
        return answerPool.get(q).get(choice) == answerList.get(q);
    }

    // get correct answer from answerList
    public String getAnswer(int q) {
        return answerList.get(q);
    }

    // get correct answer total
    public int getScore() {
        return score;
    }

    public int requestInput(String s) {
        System.out.println(s);
        return input.nextInt();
    }
}
