package JavaRegex.ReplaceAndModifyString;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void testReplaceMultipleSpacesWithSingleSpace() {
        String input = "This   is    a   test";
        String expected = "This is a test";

        String actual = input.replaceAll("\\s+", " ");
        assertEquals(expected, actual);
    }

    @Test
    public void testReplaceLeadingAndTrailingSpaces() {
        String input = "   Leading and trailing spaces   ";
        String expected = " Leading and trailing spaces ";

        String actual = input.replaceAll("\\s+", " ");
        assertEquals(expected, actual);
    }


}