package collections.set;

import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Ali");
        map.put(2, "Javad");
        map.put(3, "Vahid");
        map.put(4, "Navid");

        for (Map.Entry me : map.entrySet()) {
            System.out.println(me.getKey() + " " + me.getValue());
        }

    }
}
