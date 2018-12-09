package java8inaction.chapter5;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MappingStreamTest {
    List<String> words = Arrays.asList(
            "java", "payton", "php", "hibernate", "spring boot"
    );


    @Test
    public void mappingTest() {
        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(toList());
        System.out.println(wordLengths);
    }


}
