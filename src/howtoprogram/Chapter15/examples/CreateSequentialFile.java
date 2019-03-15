package howtoprogram.Chapter15.examples;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author imlucky
 * @Created: 2019/03/14
 * @Examples: Fig. 15.10: CreateSequentialFile.java
 */
public class CreateSequentialFile {

    private static ObjectOutputStream output;

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }

    private static void openFile() {
        try {
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get("D:\\clients.ser")));

        } catch (IOException e) {
            System.out.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }

    private static void addRecords() {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ",
                "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to end input.");

        while (input.hasNext()) {
            try {
                Account record = new Account(input.nextInt(), input.next(),
                        input.next(), input.nextDouble());

                output.writeObject(record);
            } catch (NoSuchElementException e) {
                System.out.println("Invalid input. Please try again.");
            } catch (IOException e) {
                System.out.println("Error writing to file. Terminating.");
                break;
            }
            System.out.print("?");
        }
    }

    private static void closeFile() {
        try {
            if (output != null) {
                output.close();
            }
        } catch (IOException e) {
            System.out.println("Error closing file. Terminating.");
        }
    }

}
