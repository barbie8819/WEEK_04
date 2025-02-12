package SetInterface.UnionAndIntersection;
import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class UnionIntersectionTest {
        @Test
        void testUnion() {
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
            expected.add(3);
            expected.add(4);
            expected.add(5);

            assertEquals(expected, UnionIntersection.Union(set1, set2), "Union operation failed");
        }

        @Test
        void testIntersection() {
            HashSet<Integer> set1 = new HashSet<>();
            set1.add(1);
            set1.add(2);
            set1.add(3);

            HashSet<Integer> set2 = new HashSet<>();
            set2.add(2);
            set2.add(3);
            set2.add(4);

            HashSet<Integer> expected = new HashSet<>();
            expected.add(2);
            expected.add(3);

            assertEquals(expected, UnionIntersection.Intersection(set1, set2), "Intersection operation failed");
        }

        @Test
        void testUnionWithEmptySet() {
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            set1.add(1);
            set1.add(2);

            assertEquals(set1, UnionIntersection.Union(set1, set2), "Union with empty set failed");
        }

        @Test
        void testIntersectionWithNoCommonElements() {
            HashSet<Integer> set1 = new HashSet<>();
            set1.add(1);
            set1.add(2);

            HashSet<Integer> set2 = new HashSet<>();
            set2.add(3);
            set2.add(4);

            assertTrue(UnionIntersection.Intersection(set1, set2).isEmpty(), "Intersection with no common elements should be empty");
        }

}