package SetInterface.EqualSets;

import org.junit.jupiter.api.Test;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testEqualSets() {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        assertTrue(set1.equals(set2), "The sets should be equal");
    }

    @Test
    void testNotEqualSets() {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);

        assertFalse(set1.equals(set2), "The sets should not be equal");
    }

    @Test
    void testEqualEmptySets() {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        assertTrue(set1.equals(set2), "Empty sets should be equal");
    }

    @Test
    void testDifferentSizeSets() {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        assertFalse(set1.equals(set2), "Sets with different sizes should not be equal");
    }
}
