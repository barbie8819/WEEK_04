package QueueInterface.ReverseQueue;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {
    @Test
    void testReverse() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        Queue<Integer> expected = new LinkedList<>();
        expected.add(30);
        expected.add(20);
        expected.add(10);

        assertEquals(expected, Reverse.reverse(queue), "Queue reversal failed");
    }

    @Test
    void testReverseEmptyQueue() {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> expected = new LinkedList<>();

        assertEquals(expected, Reverse.reverse(queue), "Reversing an empty queue should return an empty queue");
    }

    @Test
    void testReverseSingleElementQueue() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);

        Queue<Integer> expected = new LinkedList<>();
        expected.add(5);

        assertEquals(expected, Reverse.reverse(queue), "Reversing a single-element queue should return the same queue");
    }

}