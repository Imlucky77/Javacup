package java11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMerge {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Foo", "Bar", "Foo", "Buzz", "Foo", "Buzz", "Fizz", "Fizz");
        Map<String, Integer> map = new HashMap<>();

        //one solution
        /*for (String word : words) {
            Integer prev = map.get(word);
            if (prev == null) {
                map.put(word, 1);
            } else {
                map.put(word, prev + 1);
            }
        }*/

        // two solution
        /*words.forEach(word -> {
            map.putIfAbsent(word, 0);
            map.put(word, map.get(word) + 1);
        });*/
        /*words.forEach(word -> {
            map.putIfAbsent(word, 0);
            map.computeIfPresent(word, (w, prev) -> prev + 1);
        });*/

        words.forEach(word -> map.merge(word, 1, (prev, one) -> prev + one));
        System.out.println(map);
    }
}
