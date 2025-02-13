package QueueInterface.BinaryNumbers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateBinaryTest {

    @Test
    void testGenerateBinaryNumbers() {
        List<String> expected = List.of("1", "10", "11", "100", "101");
        assertEquals(expected, GenerateBinary.generateBinaryNumbers(5), "Binary number generation failed");
    }

    @Test
    void testGenerateBinaryNumbersForOne() {
        List<String> expected = List.of("1");
        assertEquals(expected, GenerateBinary.generateBinaryNumbers(1), "Binary number generation for N=1 failed");
    }

    @Test
    void testGenerateBinaryNumbersForZero() {
        List<String> expected = List.of();
        assertEquals(expected, GenerateBinary.generateBinaryNumbers(0), "Binary number generation for N=0 should return empty list");
    }
}