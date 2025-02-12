package SetInterface.SymmetricDifference;
import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SymmetricDiffTest {

    @Test
    void testSymmetricDifference() {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        HashSet<Integer> expected = new HashSet<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(5);

        assertEquals(expected, SymmetricDiff.symmetricDifference(set1, set2), "Symmetric difference operation failed");
    }

    @Test
    void testSymmetricDifferenceWithEmptySet() {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();

        assertEquals(set1, SymmetricDiff.symmetricDifference(set1, set2), "Symmetric difference with empty set failed");
    }

    @Test
    void testSymmetricDifferenceWithIdenticalSets() {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        assertTrue(SymmetricDiff.symmetricDifference(set1, set2).isEmpty(), "Symmetric difference of identical sets should be empty");
    }
}