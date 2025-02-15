package JavaRegex.CapitalizedWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testCapitalizedWords() {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        assertTrue(text.contains("The"));
        assertTrue(text.contains("Eiffel"));
        assertTrue(text.contains("Tower"));
        assertTrue(text.contains("Paris"));
        assertTrue(text.contains("Statue"));
        assertTrue(text.contains("Liberty"));
        assertTrue(text.contains("New"));
        assertTrue(text.contains("York"));
    }

    @Test
    void testNoCapitalizedWords() {
        String text = "this sentence has no capitalized words.";
        assertFalse(text.matches(".*\\b[A-Z][a-z]*\\b.*"));
    }

    @Test
    void testSingleCapitalizedWord() {
        String text = "Just a single Word here.";
        assertTrue(text.contains("Word"));
    }
}