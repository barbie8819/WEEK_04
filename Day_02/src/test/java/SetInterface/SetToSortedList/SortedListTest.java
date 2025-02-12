package SetInterface.SetToSortedList;
import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SortedListTest {

    @Test
    void testSortSetToList() {
        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(4);

        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, SortedList.sortSetToList(set), "Sorting set to list failed");
    }

    @Test
    void testSortSetToListWithDuplicates() {
        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(2);

        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, SortedList.sortSetToList(set), "Sorting set with duplicates failed");
    }

    @Test
    void testSortSetToListWithEmptySet() {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> expected = new ArrayList<>();
        assertEquals(expected, SortedList.sortSetToList(set), "Sorting empty set should return empty list");
    }

}