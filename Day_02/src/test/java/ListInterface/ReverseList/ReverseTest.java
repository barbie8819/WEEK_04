package ListInterface.ReverseList;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
    @Test
    void testReverseArrayList() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayListReverse.reverseArrayList(list);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), list);
    }

    @Test
    void testReverseLinkedList() {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedListReverse.reverseLinkedList(list);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), list);
    }
}