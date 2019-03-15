package howtoprogram.Chapter15.examples;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadSequentialFile {
    private static ObjectInputStream input;

    public static void main(String[] args) {
        openFile();
        readRecords();
        closeFile();

    }

    private static void openFile() {
        try {
            input = new ObjectInputStream(Files.newInputStream(Paths.get("D:\\clients.txt")));
        } catch (IOException e) {
            System.out.println("Error opening file");
            System.exit(1);
        }
    }

    private static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
                "firstName", "lastName", "balance");

        try {
            while (true) {
                Account record = (Account) input.readObject();
                System.out.printf("%-10d%-12s%-12s%10.2f%n",
                        record.getAccount(), record.getFirstName(),
                        record.getLastName(), record.getBalance());
            }
        } catch (EOFException e) {
            System.out.println("%No more records%n");
        } catch (ClassNotFoundException e) {
            System.out.println("Invalid object type. Terminating.");
        } catch (IOException e) {
            System.out.println("Error reading from file. Terminating.");
        }
    }

    private static void closeFile() {
        try {
            if (input != null) {
                input.close();
            }
        } catch (IOException e) {
            System.out.println("Error closing file. Terminating.");
            System.exit(1);
        }
    }
}
