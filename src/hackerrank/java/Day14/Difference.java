package hackerrank.java.Day14;

public class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {

        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                maximumDifference = Math.max(maximumDifference, Math.abs(elements[i] - elements[j]));
            }
        }

    }
}
