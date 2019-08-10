package unittest;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class HashMapVsHashTree {

    @Test
    public void hashMap_thenRandomOrder() {
        Map<Integer, String> hashmap = new HashMap<>();
        hashmap.put(3, "TreeMap");
        hashmap.put(2, "Vs");
        hashmap.put(1, "HashMap");

        System.out.println(hashmap);
    }

    @Test
    public void treeMap_thenNaturalOrder() {
        Map<Integer, String> treemap = new TreeMap<>();
        treemap.put(3, "TreeMap");
        treemap.put(2, "Vs");
        treemap.put(1, "HashMap");

        System.out.println(treemap);
    }

    @Test
    public void whenInsertNullInHashMap_thenInsertsNull() {
        Map<Integer, String> hashmap = new HashMap<>();
        hashmap.put(null, null);
        hashmap.put(null, null);

        assertNull(hashmap.get(null));
    }

    @Test(expected = NullPointerException.class)
    public void whenInsertNullInTreeMap_thenException() {
        Map<Integer, String> treemap = new TreeMap<>();
        treemap.put(null, "NullPointerException");
    }

    @Test
    public void givenHashMapAndTreeMap_whenputDuplicates_thenOnlyUnique() {
        Map<Integer, String> treeMap = new HashMap<>();
        treeMap.put(1, "Baeldung");
        treeMap.put(1, "Dzone");
        System.out.println(treeMap);
        assertTrue(treeMap.size() == 1);

        Map<Integer, String> treeMap2 = new TreeMap<>();
        treeMap2.put(1, "Baeldung");
        treeMap2.put(1, "Tutorial");
        System.out.println(treeMap2);
        assertTrue(treeMap2.size() == 1);
    }
}
