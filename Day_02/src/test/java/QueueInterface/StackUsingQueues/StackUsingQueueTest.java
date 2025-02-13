package QueueInterface.StackUsingQueues;
import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class StackUsingQueueTest {

    @Test
    void testPushAndPop() {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop(), "Pop should return the last pushed element");
        assertEquals(2, stack.pop(), "Next pop should return 2");
        assertEquals(1, stack.pop(), "Final pop should return 1");
    }

    @Test
    void testTop() {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(5);
        stack.push(10);
        assertEquals(10, stack.top(), "Top should return the last pushed element without removing it");
        assertEquals(10, stack.pop(), "Pop should return the same element as top");
    }

    @Test
    void testIsEmpty() {
        StackUsingQueue stack = new StackUsingQueue();
        assertTrue(stack.isEmpty(), "New stack should be empty");

        stack.push(7);
        assertFalse(stack.isEmpty(), "Stack should not be empty after pushing an element");

        stack.pop();
        assertTrue(stack.isEmpty(), "Stack should be empty after popping all elements");
    }

}