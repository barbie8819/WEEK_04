package MapInterface.mergeMaps;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
class MergeTest {
    @Test
    void testMergeTwoMaps() {
        Map<String, Integer> map1 = new HashMap<>(Map.of("A", 1, "B", 2));
        Map<String, Integer> map2 = new HashMap<>(Map.of("B", 3, "C", 4));

        Map<String, Integer> expected = new HashMap<>(Map.of("A", 1, "B", 5, "C", 4));
        assertEquals(expected, Merge.mergeTwoMaps(map1, map2));
    }

    @Test
    void testMergeWithEmptyMap() {
        Map<String, Integer> map1 = new HashMap<>(Map.of("A", 1));
        Map<String, Integer> map2 = new HashMap<>();

        assertEquals(map1, Merge.mergeTwoMaps(map1, map2));
    }

    @Test
    void testMergeTwoEmptyMaps() {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        assertTrue(Merge.mergeTwoMaps(map1, map2).isEmpty());
    }

}