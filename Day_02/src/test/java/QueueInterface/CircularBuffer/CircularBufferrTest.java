package QueueInterface.CircularBuffer;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class CircularBufferrTest {
    @Test
    void testCircularBuffer() {
        CircularBufferr buffer = new CircularBufferr(3);

        buffer.add(1);
        buffer.add(2);
        buffer.add(3);

        assertArrayEquals(new int[]{1, 2, 3}, buffer.getBufferContents());

        buffer.add(4);

        assertArrayEquals(new int[]{2, 3, 4}, buffer.getBufferContents());

        buffer.add(5);
        buffer.add(6);

        assertArrayEquals(new int[]{4, 5, 6}, buffer.getBufferContents());
    }

}