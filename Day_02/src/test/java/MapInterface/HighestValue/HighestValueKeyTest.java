package MapInterface.HighestValue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
class HighestValueKeyTest {
    @Test
    void testFindMaxKey() {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 10);
        input.put("B", 20);
        input.put("C", 15);
        assertEquals("B",HighestValueKey.findMaxKey(input), "Incorrect key with max value");
    }

    @Test
    void testEmptyMap() {
        Map<String, Integer> input = new HashMap<>();
        assertNull(HighestValueKey.findMaxKey(input), "Empty map should return null");
    }

    @Test
    void testSingleEntryMap() {
        Map<String, Integer> input = new HashMap<>();
        input.put("X", 42);
        assertEquals("X", HighestValueKey.findMaxKey(input), "Single entry map should return only key");
    }

}