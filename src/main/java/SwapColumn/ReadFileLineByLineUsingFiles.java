package SwapColumn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReadFileLineByLineUsingFiles {

    public static void main(String[] args) {
        try {
            List<String> allLines = Files.readAllLines(Paths.get("D:\\examples\\input.txt"));
            int count = 0;
            for (String line : allLines) {
                if (count == 0) {

                } else {
                    FileWriter outFile = new FileWriter("D:\\examples\\output.txt", true);
                    //String replace = line.replaceAll(",", "/");
                    String[] split = line.split("/");
                    Collections.swap(Arrays.asList(split),0, 3);
                    //outFile.write(replace + "\n");
                    outFile.close();
                }
                count++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
