package free.javase;

import java.util.*;

public class MapInstance {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();

        map.put("a", Arrays.asList("a", "b"));
        //map.put(null, list);


        for (Map.Entry<String, List<String>> me : map.entrySet()) {
            String key = me.getKey();
            List<String> value = me.getValue();
            System.out.print(key + ": ");
            System.out.println(value);
        }
    }
}
