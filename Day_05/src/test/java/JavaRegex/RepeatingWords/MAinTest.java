package JavaRegex.RepeatingWords;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class MAinTest {
    @Test
    void testFindRepeatedWords() {
        String text = "This is is a repeated repeated word test.";
        Set<String> expected = new HashSet<>();
        expected.add("is");
        expected.add("repeated");

        Set<String> actual = MAin.findRepeatedWords(text);
        assertEquals(expected, actual, "The repeated words should be 'is' and 'repeated'");
    }

    @Test
    void testNoRepeatedWords() {
        String text = "This is a unique test.";
        Set<String> expected = new HashSet<>();

        Set<String> actual = MAin.findRepeatedWords(text);
        assertEquals(expected, actual, "There should be no repeated words.");
    }

    @Test
    void testWithMultipleRepeats() {
        String text = "apple banana apple banana apple";
        Set<String> expected = new HashSet<>();
        expected.add("apple");
        expected.add("banana");

        Set<String> actual = MAin.findRepeatedWords(text);
        assertEquals(expected, actual, "The repeated words should be 'apple' and 'banana'");
    }
}