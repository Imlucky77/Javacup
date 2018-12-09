package java8inaction.chapter3;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.function.Function;

public class BufferedMain {
    public static void main(String[] args) {

        //BufferedReaderProcessor brp = (BufferedReader br) -> br.readLine();
        BufferedReaderProcessor brp = BufferedReader::readLine;

        Function<BufferedReader, String> function =
                (BufferedReader br) -> {
                    try {
                        return br.readLine();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                };
    }
}
