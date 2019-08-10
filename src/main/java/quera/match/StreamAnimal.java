package quera.match;

import java.util.ArrayList;
import java.util.List;

public class StreamAnimal {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();
        animals.add("bat");
        animals.add("owl");
        animals.add("bat");
        animals.add("bat");

        long count = animals.stream().filter(ani -> "bat".equals(ani)).count();
        System.out.println(count);
    }
}
