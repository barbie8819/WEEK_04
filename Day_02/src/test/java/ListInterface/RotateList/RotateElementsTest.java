package ListInterface.RotateList;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RotateElementsTest {

    @Test
    void testReverse() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        RotateElements.Reverse(list, 0, 4);
        assertEquals(Arrays.asList(5, 4, 3, 2, 1), list, "Reverse method failed");
    }

    @Test
    void testRotate() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        RotateElements.Rotate(list, 2);
        assertEquals(Arrays.asList(3, 4, 5, 1, 2), list, "Rotate method failed");
    }

    @Test
    void testRotateFullLength() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        RotateElements.Rotate(list, 5); // Rotating by full length should return the same list
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), list, "Rotate full length failed");
    }

    @Test
    void testRotateZero() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        RotateElements.Rotate(list, 0); // Rotating by 0 should return the same list
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), list, "Rotate zero failed");
    }

    @Test
    void testRotateLargeK() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        RotateElements.Rotate(list, 7); // 7 % 5 = 2, so it should rotate by 2 places
        assertEquals(Arrays.asList(3, 4, 5, 1, 2), list, "Rotate large k failed");
    }
}