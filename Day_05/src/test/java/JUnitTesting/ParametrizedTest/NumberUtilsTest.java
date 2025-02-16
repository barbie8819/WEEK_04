package JUnitTesting.ParametrizedTest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {
    private NumberUtils utils;

    @BeforeEach
    void setUp() {
        utils = new NumberUtils();
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int number) {
        boolean expected = number % 2 == 0;
        assertEquals(expected, utils.isEven(number), "Check if " + number + " is even");
    }

}