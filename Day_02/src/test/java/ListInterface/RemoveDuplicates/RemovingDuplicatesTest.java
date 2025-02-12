package ListInterface.RemoveDuplicates;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class RemovingDuplicatesTest {
    @Test
    void testRemoveDuplicates() {
        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> expected = Arrays.asList(3, 1, 2, 4);
        assertEquals(expected, RemovingDuplicates.removeDuplicates(input));
    }
}