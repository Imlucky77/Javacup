package quera;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Double> cat = new HashMap<String, Double>();
        cat.put("IFF", 8.8);
        cat.put("AIS", 8.7);
        cat.put("DEF", 8.3);


        Map<String, Double> map = new HashMap<String, Double>();
        map.put("Forrest Gump", 8.8);
        map.put("The Matrix", 8.7);
        map.put("The Hunt", 8.3);
        map.put("Monty Python's Life of Brian", 8.1);
        map.put("Who's Singin' Over There?", 8.9);

        map.entrySet()
                .stream()
                .filter(entry -> {
                    for (String key : cat.keySet()) {
                        System.out.println("1");
                    }
                    return false;
                })

                /*entry.getValue() > 8.4)*/
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

//        map.forEach((k, v) -> {
//            if (v > 8.4) {
//                System.out.println(k + ": " + v);
//            }
//        });
    }
}
