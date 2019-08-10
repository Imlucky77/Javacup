package quera.exercise;

public class CompleteNumber_02 {
    public static void main(String[] args) {
        CompleteNumber_02 completeNumber = new CompleteNumber_02();
        completeNumber.countNumbers();
    }

    public void countNumbers() {
        for (int i = 2; i <= 10000; i++) {
            int s = 0;
            for (int j = 2; j <= i / 2; j++) {
                if ((i % j) == 0) {
                    s = s + j;
                } else {
                    s += 0;
                }
            }
            if (i == ++s) {
                System.out.println(i);
            }
        }
    }

    @Override
    public String toString() {
        return "CompleteNumber_02{}";
    }
}
