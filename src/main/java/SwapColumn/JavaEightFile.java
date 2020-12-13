package SwapColumn;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class JavaEightFile {
    public static void main(String[] args) throws IOException {
        /*Files.lines(new File("D:\\examples\\input.txt").toPath())
                .map(s -> s.trim()).skip(1)
                .filter(s -> !s.matches(""))
                .forEach(System.out::println);*/
        List<String> allLines = Files.readAllLines(Paths.get("D:\\examples\\input.txt"));
        for (String list : allLines) {
            //System.out.println(list);
            Stream<String> stream = Arrays.stream(new String[]{list});
            //Collections.swap(allLines, 0, 3);
            stream.skip(1).map(s -> s.replaceAll(",", "/")).forEach(System.out::println);

        }
    }

}
