package MultipleCatchBlocks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testInvalidIndex() {
        int[] arr = {10, 20, 30, 40, 50};
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            getArrayValue(arr, 10);
        });
        assertTrue(exception instanceof ArrayIndexOutOfBoundsException);
    }

    @Test
    public void testNullArray() {
        int[] arr = null;
        Exception exception = assertThrows(NullPointerException.class, () -> {
            getArrayValue(arr, 0);
        });
        assertTrue(exception instanceof NullPointerException);
    }

    // Helper method for array operations
    private int getArrayValue(int[] arr, int index) {
        return arr[index];
    }

}