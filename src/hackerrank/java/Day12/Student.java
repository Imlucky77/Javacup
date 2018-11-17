package hackerrank.java.Day12;

class Student extends Person {
    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    public char calculate() {
        int sum = 0;
        for (int i = 0; i < testScores.length; i++) {
            sum += testScores[i];
        }

       /* for(int i : this.testScores)
        {
            sum+=i;
        }*/

        int average = sum / testScores.length;

        if (average >= 90 && average <= 100) {
            return 'O';
        } else if (average >= 80 && average < 90) {
            return 'E';
        } else if (average >= 70 && average <= 80) {
            return 'A';
        } else if (average >= 55 && average <= 70) {
            return 'P';
        } else if (average >= 40 && average <= 55) {
            return 'D';
        } else {
            return 'T';
        }
    }

}