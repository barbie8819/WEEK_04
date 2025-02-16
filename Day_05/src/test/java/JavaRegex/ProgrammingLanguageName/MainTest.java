package JavaRegex.ProgrammingLanguageName;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testExtractLanguages() {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        String expected = "Java, Python, JavaScript, Go";
        assertEquals(expected, Main.extractLanguages(text));
    }

    @Test
    public void testNoLanguages() {
        String text = "I love cooking and hiking.";
        String expected = "";
        assertEquals(expected, Main.extractLanguages(text));
    }

    @Test
    public void testMultipleOccurrences() {
        String text = "Java is great, and JavaScript is different from Java.";
        String expected = "Java, JavaScript, Java";
        assertEquals(expected, Main.extractLanguages(text));
    }

}