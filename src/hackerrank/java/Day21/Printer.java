package hackerrank.java.Day21;

public class Printer<T> {

    public void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
