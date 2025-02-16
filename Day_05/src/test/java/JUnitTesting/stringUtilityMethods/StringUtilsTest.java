package JUnitTesting.stringUtilityMethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test
    void testReverse() {
        StringUtils utils = new StringUtils();
        assertEquals("olleh", utils.reverse("hello"), "The reversed string should be 'olleh'");
    }

    @Test
    void testIsPalindromeTrue() {
        StringUtils utils = new StringUtils();
        assertTrue(utils.isPalindrome("madam"), "The string 'madam' should be a palindrome");
    }

    @Test
    void testIsPalindromeFalse() {
        StringUtils utils = new StringUtils();
        assertFalse(utils.isPalindrome("hello"), "The string 'hello' should not be a palindrome");
    }

    @Test
    void testToUpperCase() {
        StringUtils utils = new StringUtils();
        assertEquals("HELLO", utils.toUpperCase("hello"), "The string should be converted to uppercase");
    }
}