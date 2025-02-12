package SetInterface.FindSubsets;
import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SubsetFinderTest {

        @Test
        void testIsSubset() {
            HashSet<Integer> set1 = new HashSet<>();
            set1.add(1);
            set1.add(2);

            HashSet<Integer> set2 = new HashSet<>();
            set2.add(1);
            set2.add(2);
            set2.add(3);

            assertTrue(SubsetFinder.isSubset(set1, set2), "set1 should be a subset of set2");
        }

        @Test
        void testIsNotSubset() {
            HashSet<Integer> set1 = new HashSet<>();
            set1.add(1);
            set1.add(4);

            HashSet<Integer> set2 = new HashSet<>();
            set2.add(1);
            set2.add(2);
            set2.add(3);

            assertFalse(SubsetFinder.isSubset(set1, set2), "set1 should not be a subset of set2");
        }

        @Test
        void testEmptySetIsSubset() {
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();
            set2.add(1);
            set2.add(2);

            assertTrue(SubsetFinder.isSubset(set1, set2), "An empty set should be a subset of any set");
        }

        @Test
        void testIdenticalSets() {
            HashSet<Integer> set1 = new HashSet<>();
            set1.add(1);
            set1.add(2);
            set1.add(3);

            HashSet<Integer> set2 = new HashSet<>();
            set2.add(1);
            set2.add(2);
            set2.add(3);

            assertTrue(SubsetFinder.isSubset(set1, set2), "Identical sets should be subsets of each other");
        }
    }


