package JavaRegex.CensorBadWords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void testCensorBadWords() {
        String text = "This is a damn bad example with some stupid words.";
        String expected = "This is a **** bad example with some **** words.";
        String actual = Main.censoredWord( new String[]{"damn", "stupid"},text);
        assertEquals(expected, actual);
    }

    @Test
    public void testNoBadWords() {
        String text = "This is a clean sentence.";
        String expected = "This is a clean sentence.";
        String actual = Main.censoredWord( new String[]{"damn", "stupid"},text);
        assertEquals(expected, actual);
    }

    @Test
    public void testPartialWordShouldNotBeCensored() {
        String text = "This is a dam nice view.";
        String expected = "This is a dam nice view.";
        String actual = Main.censoredWord( new String[]{"damn"},text);
        assertEquals(expected, actual);
    }

    @Test
    public void testCensorMultipleOccurrences() {
        String text = "stupid is as stupid does.";
        String expected = "**** is as **** does.";
        String actual = Main.censoredWord(new String[]{"stupid"},text);
        assertEquals(expected, actual);
    }

}