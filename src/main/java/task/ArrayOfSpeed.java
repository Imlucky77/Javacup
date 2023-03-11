package task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayOfSpeed {
    public static void main(String[] args) {

        Map<String, Object> mapmap = new HashMap<>();
        mapmap.put("lat", 2000);
        mapmap.put("lon", 3000);
        mapmap.put("alt", 10000);
        mapmap.put("speed", 125);
//
        mapmap.put("lat", 3000);
        mapmap.put("lon", 4000);
        mapmap.put("alt", 11000);
        mapmap.put("speed", 150);
//        Object speed = map.get("speed");
//        System.out.println(speed);
//
//        List<Map<String, Object>> listMap = new ArrayList<>();
//        listMap.add(map);
//
//        System.out.println(listMap);

        List<Map<String, Object>> listOfMaps = new ArrayList<>();// initializing the list
        listOfMaps.add(mapmap);

        System.out.println("listOfMap" + listOfMaps);

        Map<String, List<Object>> result = listOfMaps.stream()
                .flatMap(map -> map.entrySet().stream())
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.mapping(Map.Entry::getValue,
                                Collectors.toList())
                ));

        System.out.println(result);
    }
}
