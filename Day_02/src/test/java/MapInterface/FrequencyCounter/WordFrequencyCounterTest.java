package MapInterface.FrequencyCounter;
import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyCounterTest {

    @Test
    void testCountWordFrequency() {
        String testInput = "hello world hello Java";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        expected.put("java", 1);

        HashMap<String, Integer> actual = WordFrequencyCounter.countWordFrequency("C:/Users/scc/Desktop/readme.txt/"); // Assume test file contains testInput
        assertEquals(expected, actual, "Word frequency count is incorrect");
    }

    @Test
    void testEmptyFile() {
        HashMap<String, Integer> expected = new HashMap<>();
        assertEquals(expected, WordFrequencyCounter.countWordFrequency("emptyFile.txt"), "Empty file should return empty map");
    }

    @Test
    void testPunctuationHandling() {
        String testInput = "Hello, world! Hello? JAVA.";
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("hello", 2);
        expected.put("world", 1);
        expected.put("java", 1);

        HashMap<String, Integer> actual = WordFrequencyCounter.countWordFrequency("punctuationFile.txt"); // Assume file contains testInput
        assertEquals(expected, actual, "Punctuation handling is incorrect");
    }

}