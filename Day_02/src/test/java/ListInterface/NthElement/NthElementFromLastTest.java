package ListInterface.NthElement;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class NthElementFromLastTest {

    @Test
    void testFindNthFromEnd() {
        LinkedList<Character> list = new LinkedList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        assertEquals('D', NthElementFromLast.nthElement(list , 2), "Failed for N=2");
    }

    @Test
    void testFindFirstFromEnd() {
        LinkedList<Character> list = new LinkedList<>();
        list.add('X');
        list.add('Y');
        list.add('Z');

        assertEquals('Z', NthElementFromLast.nthElement(list, 1), "Failed for N=1");
    }

    @Test
    void testFindNthFromEndInvalidN() {
        LinkedList<Character> list = new LinkedList<>();
        list.add('A');
        list.add('B');

        assertThrows(IllegalArgumentException.class, () ->
                NthElementFromLast.nthElement(list, 3), "N larger than list size should throw exception"
        );
    }

    @Test
    void testFindNthFromEndNegativeN() {
        LinkedList<Character> list = new LinkedList<>();
        list.add('A');
        list.add('B');

        assertThrows(IllegalArgumentException.class, () ->
                NthElementFromLast.nthElement(list, -1), "Negative N should throw exception"
        );
    }

    @Test
    void testFindNthFromEmptyList() {
        LinkedList<Character> list = new LinkedList<>();

        assertThrows(IllegalArgumentException.class, () ->
                NthElementFromLast.nthElement(list, 1), "Empty list should throw exception"
        );
    }
}