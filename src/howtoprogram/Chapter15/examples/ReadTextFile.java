package howtoprogram.Chapter15.examples;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/03/14
 * @Examples: Fig. 15.6: ReadTextFile.java
 */
public class ReadTextFile {
    public static Scanner input;

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();
    }

    public static void openFile() {
        try {
            input = new Scanner(Paths.get("D:\\clients.txt"));
        } catch (IOException e) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    public static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n",
                "Amount", "firstName", "lastName", "balance");
        try {
            while (input.hasNext()) {

                System.out.printf("%-10d%-12s%-12s%10.2f%n",
                        input.nextInt(), input.next(), input.next(), input.nextDouble());
            }
        } catch (NoSuchElementException e) {
            System.err.println("File improperly formed. Terminating.");
        } catch (IllegalStateException e) {
            System.err.println("Error reading from file. Terminating.");
        }
    }

    public static void closeFile() {
        if (input != null) {
            input.close();
        }
    }

}
