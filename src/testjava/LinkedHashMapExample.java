package testjava;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();

        hm.put(101, "java");
        hm.put(102, "c#");
        hm.put(103, "paython");
        hm.put(104, "C++");

        for (Map.Entry itr : hm.entrySet()) {
            System.out.println(itr.getKey() + " " + itr.getValue());
        }
    }
}
