package basicjava.javase;

public class StaticBlockExample {

    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0}, {0, 0, 0}, {1, 1, 1}, {0, 1, 1}};

        outer:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][0] == 1) {
                    System.out.println("Skipping row " + i + " as it started with 1");
                    continue outer;
                }
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
}
