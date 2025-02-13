package MapInterface.invertAMap;
import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class InvertMapTest {
    @Test
    void testInvertMap() {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);

        Map<Integer, List<String>> expected = new HashMap<>();
        expected.put(1, Arrays.asList("A", "C"));
        expected.put(2, Collections.singletonList("B"));

        assertEquals(expected, InvertMap.invertMap(input), "Map inversion is incorrect");
    }

    @Test
    void testEmptyMap() {
        Map<String, Integer> input = new HashMap<>();
        Map<Integer, List<String>> expected = new HashMap<>();
        assertEquals(expected, InvertMap.invertMap(input), "Empty map should return empty map");
    }

}